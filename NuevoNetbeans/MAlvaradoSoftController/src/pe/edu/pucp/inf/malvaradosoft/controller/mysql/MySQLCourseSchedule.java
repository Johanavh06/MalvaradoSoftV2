/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourseSchedule;
import pe.edu.pucp.inf.malvaradosoft.model.bean.CourseSchedule;

/**
 *
 * @author Renato
 */
public class MySQLCourseSchedule implements DAOCourseSchedule{

    @Override
    public ArrayList<CourseSchedule> queryAll() {
        ArrayList<CourseSchedule> courseSchedules = new ArrayList<CourseSchedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_COURSESCHEDULE WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                CourseSchedule cs = new CourseSchedule();
                cs.setId(rs.getInt("idCourseSchedule"));
                cs.getClassSection().setId(rs.getInt("idClassSection"));
                cs.getClassroom().setId(rs.getInt("idClassroom"));
                cs.getTeacherXyear.setId(rs.getInt("idTeacher"));
                cs.getCourse().setId(rs.getInt("idCourse"));                
                courseSchedules.add(cs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return courseSchedules;
    }

    @Override
    public ArrayList<CourseSchedule> queryById(int idCourse, int idSchedule) {
         ArrayList<CourseSchedule> courseSchedules = new ArrayList<CourseSchedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM SchedulexCourse WHERE active=1 AND idCourse=" + ""+idCourse 
                    + " AND " + ""+idSchedule;
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                CourseSchedule cs = new CourseSchedule();
                cs.setId(rs.getInt("idCourseSchedule"));
                cs.getClassSection().setId(rs.getInt("idClassSection"));
                cs.getClassroom().setId(rs.getInt("idClassroom"));
                cs.getTeacherXyear.setId(rs.getInt("idTeacher"));
                cs.getCourse().setId(rs.getInt("idCourse"));                
                courseSchedules.add(cs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return courseSchedules;
    }

    @Override
    public int insert(CourseSchedule courseSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(CourseSchedule courseSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int idCourse, int idSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
