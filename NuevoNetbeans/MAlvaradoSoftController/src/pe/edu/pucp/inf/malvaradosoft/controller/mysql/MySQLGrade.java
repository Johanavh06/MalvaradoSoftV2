/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOGrade;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Grade;

/**
 *
 * @author alulab14
 */
public class MySQLGrade implements DAOGrade {

    @Override
    public ArrayList<Grade> queryAll() {
        ArrayList<Grade> grades = new ArrayList<Grade>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_GRADE WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Grade g = new Grade();
                g.setIdGrade(rs.getInt("idGrade"));
                g.setDescription(rs.getString("description"));
                g.setWeight(rs.getDouble("weight"));
                g.getCourse().setId(rs.getInt("idCourse"));
                                
                grades.add(g);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return grades;
    }

    @Override
    public ArrayList<Grade> queryGradesByCourseId(Course course) {
        ArrayList<Grade> grades = new ArrayList<Grade>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYGRADESBYCOURSEID(?)}");
            cs.setInt("_IDCOURSE", course.getId());
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                Grade g = new Grade();
                g.setIdGrade(rs.getInt("idGrade"));
                g.setDescription(rs.getString("description"));
                g.setWeight(rs.getDouble("weight"));
                g.getCourse().setId(rs.getInt("idCourse"));                
                grades.add(g);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return grades;
    }

    @Override
    public ArrayList<Grade> querySearchByName(String description, Course course) {
        ArrayList<Grade> grades = new ArrayList<Grade>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_SEARCHGRADEBYNAMEXCOURSE(?, ?)}");
            cs.setInt("_IDCOURSE", course.getId());
            cs.setString("_DESCRIPTION", description);
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                Grade g = new Grade();
                g.setIdGrade(rs.getInt("idGrade"));
                g.setDescription(rs.getString("description"));
                g.setWeight(rs.getDouble("weight"));
                g.getCourse().setId(rs.getInt("idCourse"));                
                grades.add(g);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return grades;
    }

    @Override
    public int insert(Grade grade) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTGRADE(?,?,?,?)}");
            
            cs.registerOutParameter("_ID", java.sql.Types.INTEGER);
            cs.setString("_DESCRIPTION", grade.getDescription());
            cs.setDouble("_WEIGHT", grade.getWeight());
            cs.setInt("_IDCOURSE", grade.getCourse().getId());
            
            result = cs.executeUpdate();
            
            grade.setIdGrade(cs.getInt("_ID"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Grade grade) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATEGRADE(?,?,?,?)}");
            
            cs.setInt("_ID", grade.getIdGrade());
            cs.setString("_DESCRIPTION", grade.getDescription());
            cs.setDouble("_WEIGHT", grade.getWeight());
            cs.setInt("_IDCOURSE", grade.getCourse().getId());
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETEGRADE(?)}");
            
            cs.setInt("_ID", id);
            
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
