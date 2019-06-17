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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourse;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;

/**
 *
 * @author Renato
 */
public class MySQLCourse implements DAOCourse{

    @Override
    public ArrayList<Course> queryAll() {
        ArrayList<Course> courses = new ArrayList<Course>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_COURSE WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Course c = new Course();
                c.setId(rs.getInt("idCourse"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                                
                courses.add(c);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return courses;
    }

    @Override
    public ArrayList<Course> queryAllCourseByLevel(int level) {
        ArrayList<Course> courses = new ArrayList<Course>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertCourse(?)}");
            cs.setInt("_LEVEL", level);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Course c = new Course();
                c.setId(rs.getInt("idCourse"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                                
                courses.add(c);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return courses;
    }

    @Override
    public int insert(Course course) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCOURSE(?,?,?)}");
            
            cs.registerOutParameter("_ID", java.sql.Types.INTEGER);
            cs.setString("_NAME", course.getName());
            cs.setInt("_LEVEL", course.getLevel());                     
            
            result = cs.executeUpdate();
            
            course.setId(cs.getInt("_ID"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Course course) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATECOURSE(?,?,?)}");
            cs.setInt("_ID", course.getId());
            cs.setString("_NAME", course.getName());  
            cs.setInt("_LEVEL", course.getLevel());   
            
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
            CallableStatement cs = con.prepareCall("{call MS_DELETECOURSE(?)}");
            cs.setInt("_ID", id);
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
