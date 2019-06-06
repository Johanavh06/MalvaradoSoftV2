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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOClassSection;

/**
 *
 * @author alulab14
 */
public class MySQLClassSection implements DAOClassSection{

    @Override
    public ArrayList<ClassSection> queryAll() {
        ArrayList<ClassSection> classesSections = new ArrayList<ClassSection>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM ClassSection";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Student> students = DBController.queryAllStudents();
            ArrayList<CourseXSchedule> courses = DBController.queryAllCourseXSchedule();
            while(rs.next()){
                ClassSection cxs = new ClassSection();
                cxs.setIdClassSection(rs.getInt("idSection"));
                cxs.setTotal(rs.getInt("total"));
                cxs.setName(rs.getString("name"));
                for(int i=0; i<students.size() ;i++){
                    if(students.get(i).getClassSection().getIdClassSection() == cxs.getIdClassSection())
                        cxs.addStudents(students.get(i));
                }
                for(int i=0; i<courses.size() ;i++){
                    if(courses.get(i).getClassSection().getIdClassSection() == cxs.getIdClassSection())
                        cxs.addCourses(courses.get(i));
                }
                classesSections.add(cxs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return classesSections;
    }

    @Override
    public ClassSection queryAllByIDClassSection(int id) {
        int result = 0;
        ClassSection classSection = new ClassSection();
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllByIDClassSection(?)}");
            cs.setInt(1, id );
            result = cs.executeUpdate();
            ResultSet rs = cs.executeQuery();
            int i=0;
            while(rs.next()){
                classSection.setIdClassSection(id);
                classSection.setTotal(rs.getInt("total"));
                classSection.setName(rs.getString("name"));
                //se llenan datos para un estudiante
                Student s = new Student();
                s.setIdUser(rs.getInt("idUser"));
                s.setNames(rs.getString("name_Student"));
                s.setFirstLastName(rs.getString("FirstLastName_Student"));
                s.setSecondLastName(rs.getString("SecondLastName_Student"));
                if(!classSection.getStudents().contains(s)){
                    classSection.addStudents(s);
                }
                //se llenan datos para un CourseXSchedule
                CourseXSchedule cxs = new CourseXSchedule();
                cxs.setCourseXScheduleID(rs.getInt("idCourseXSchedule"));
                Course course= new Course();
                course.setIdCourse(rs.getInt("idCourse"));
                course.setName(rs.getString("name_Course"));
                cxs.setCourse(course);
                if(!classSection.getCourses().contains(cxs)){
                    classSection.addCourses(cxs);
                }
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return classSection;
    }

    @Override
    public int insertClassSection(ClassSection classSection) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertClassSection(?,?,?)}");
            cs.registerOutParameter("_idClassSection", java.sql.Types.INTEGER);
            //cs.setInt(1, classSection.getIdClassSection() );
            cs.setInt(2, classSection.getTotal() );
            cs.setString(3, classSection.getName() );
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateClassSection(ClassSection classSection) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertClassSection(?,?)}");
            cs.setInt(1, classSection.getTotal() );
            cs.setString(2, classSection.getName() );
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteClassSection(int id) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call deleteClassSection(?)}");
            cs.setInt(1, id);
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

}
