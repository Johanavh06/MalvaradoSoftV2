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
                //cs.getTeacherXyear.setId(rs.getInt("idTeacher"));
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
    public ArrayList<CourseSchedule> queryById(int idCourse, int idClassSection) {
         ArrayList<CourseSchedule> courseSchedules = new ArrayList<CourseSchedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYALLBYIDCOURSEIDSCHEDULE(?,?)}");
            cs.setInt("_IDCOURSE", idCourse);
            cs.setInt("_IDCLASSSECTION", idClassSection);
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                CourseSchedule csc = new CourseSchedule();
                csc.setId(rs.getInt("idCourseSchedule"));
                csc.getClassSection().setId(rs.getInt("idClassSection"));
                csc.getClassroom().setId(rs.getInt("idClassroom"));
                csc.getTeacherXyear().setIdTeacherXYear(rs.getInt("idTeacher"));
                csc.getCourse().setId(rs.getInt("idCourse"));                
                courseSchedules.add(csc);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return courseSchedules;
    }

    @Override
    public int insert(CourseSchedule courseSchedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCOURSESCHEDULE(?,?,?,?,?)}");
            
            cs.registerOutParameter("_IDCOURSESCHEDULE", java.sql.Types.INTEGER);
            cs.setInt("_IDCLASSROOM", courseSchedule.getClassroom().getId());
            cs.setInt("_IDCOURSE", courseSchedule.getCourse().getId());                     
            cs.setInt("_IDCLASSSECTION", courseSchedule.getClassSection().getId());  
            cs.setInt("_IDTEACHER", courseSchedule.getTeacherXyear().getIdTeacherXYear()); 
            result = cs.executeUpdate();
            
            courseSchedule.setId(cs.getInt("_IDCOURSESCHEDULE"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(CourseSchedule courseSchedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATECOURSESCHEDULE(?,?,?,?,?)}");
            cs.setInt("_IDCOURSESCHEDULE", courseSchedule.getId());
            cs.setInt("_IDCLASSROOM", courseSchedule.getClassroom().getId());
            cs.setInt("_IDCOURSE", courseSchedule.getCourse().getId());                     
            cs.setInt("_IDCLASSSECTION", courseSchedule.getClassSection().getId());  
            cs.setInt("_IDTEACHER", courseSchedule.getTeacherXyear().getIdTeacherXYear()); 
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int idCourseSchedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETECOURSESCHEDULE(?)}");
            cs.setInt("_IDCOURSESCHEDULE", idCourseSchedule);
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
 }
    

