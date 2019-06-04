/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Grade;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOGrade;

/**
 *
 * @author alulab14
 */
public class MySQLGrade implements DAOGrade{

    @Override
    public ArrayList<Grade> queryAll() {
        ArrayList<Grade> grades = new ArrayList<Grade>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Grade where active = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Grade g = new Grade();
                g.setIdGrade(rs.getInt("idGrade"));
                g.getCoursexschedule().setIdCourseSchedule(rs.getInt("idCourseXSchedule"));
                g.setDescription(rs.getString("description"));
                g.setWeight(rs.getDouble("weight"));
                grades.add(g);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return grades;
    }

    @Override
    public int insert(Grade g) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertGrade(?,?,?,?,?)}");
            cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setString(2, g.getDescription());
            cs.setDouble(3, g.getWeight());
            cs.setInt(4, g.getCoursexschedule().getIdCourseXSchedule());
            cs.setInt(5, 1);
            result= cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(Grade g) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call updateGrade(?,?,?,?)}");
            cs.setInt(1, g.getIdGrade());
            cs.setString(2, g.getDescription());
            cs.setDouble(3, g.getWeight());
            cs.setInt(4, g.getCoursexschedule().getIdCourseXSchedule());
            result= cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int delete(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call deleteGrade(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }
    
}
