/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grade> queryGradesByCourseId(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grade> querySearchByName(String description, Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            CallableStatement cs = con.prepareCall("{call MS_DELETEGRADE(?,?,?,?)}");
            
            cs.setInt("_ID", id);
            
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
