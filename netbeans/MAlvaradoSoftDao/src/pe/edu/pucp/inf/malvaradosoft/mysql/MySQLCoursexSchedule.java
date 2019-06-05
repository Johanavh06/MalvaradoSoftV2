/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.ClassSection;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Course;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.CourseXSchedule;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Schedule;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOCourseXSchedule;

/**
 *
 * @author alulab14
 */
public class MySQLCoursexSchedule implements DAOCourseXSchedule {

    @Override
    public ArrayList<CourseXSchedule> queryAll() {
         ArrayList<CourseXSchedule> courseXSchedules = new ArrayList<CourseXSchedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM SchedulexCourse WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                CourseXSchedule cxs = new CourseXSchedule();
                //cxs.setIdCourseXSchedule(rs.getInt("idCourseXSchedule"));
                cxs.getClassSection().setIdClassSection(rs.getInt("idClassSection"));
                cxs.getSchedule().setIdSchedule(rs.getInt("idSchedule"));
                cxs.getTeacher().setIdUser(rs.getInt("idTeacher"));
                cxs.getCourse().setIdCourse(rs.getInt("idCourse"));                
                courseXSchedules.add(cxs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return courseXSchedules;
    }
    
    @Override
    public ArrayList<CourseXSchedule> queryById(int idCourse, int idSchedule) {
         ArrayList<CourseXSchedule> courseXSchedules = new ArrayList<CourseXSchedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM SchedulexCourse WHERE active=1 AND idCourse=" + ""+idCourse 
                    + " AND " + ""+idSchedule;
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                CourseXSchedule cxs = new CourseXSchedule();
                //cxs.setIdCourseXSchedule(rs.getInt("idCourseXSchedule"));
                cxs.getClassSection().setIdClassSection(rs.getInt("idClassSection"));
                cxs.getSchedule().setIdSchedule(rs.getInt("idSchedule"));
                cxs.getTeacher().setIdUser(rs.getInt("idTeacher"));
                cxs.getCourse().setIdCourse(rs.getInt("idCourse"));                
                courseXSchedules.add(cxs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return courseXSchedules;
    }

    @Override
    public int insert(CourseXSchedule coursexSchedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall( "{call insertCourseSchedule(?,?,?,?)}");
            //cs.registerOutParameter("_id", java.sql.Types.INTEGER);
            cs.setInt("_idClassSection", coursexSchedule.getClassSection().getIdClassSection());
            cs.setInt("_idSchedule", coursexSchedule.getSchedule().getIdSchedule());
            cs.setInt("_idTeacher", coursexSchedule.getTeacher().getIdUser());
            cs.setInt("_idCourse", coursexSchedule.getCourse().getIdCourse());
            
            result = cs.executeUpdate();
            
            //coursexSchedule.setIdCourseXSchedule(cs.getInt("_id"));
                        
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(CourseXSchedule coursexSchedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call updateCoursexSchedule(?,?,?,?,?)}");
            //cs.setInt("_id", coursexSchedule.getIdCourseXSchedule());
            cs.setInt("_idClassSection", coursexSchedule.getClassSection().getIdClassSection());
            cs.setInt("_idSchedule", coursexSchedule.getSchedule().getIdSchedule());
            cs.setInt("_idTeacher", coursexSchedule.getTeacher().getIdUser());
            cs.setInt("_idCourse", coursexSchedule.getCourse().getIdCourse());
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int idCourse, int idSchedule) {
      int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call deleteCoursexSchedule(?,?)}");
            cs.setInt("_idCourse",idCourse);   
            cs.setInt("_idSchedule",idSchedule);   
            
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;  
    }
    
}
