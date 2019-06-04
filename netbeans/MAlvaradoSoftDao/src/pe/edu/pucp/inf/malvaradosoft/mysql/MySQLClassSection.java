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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.CourseXSchedule;
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
            ArrayList<Student> students = DBController.queryAllStudent();
            ArrayList<CourseXSchedule> courses = DBController.queryAllCourseXSchedule();
            while(rs.next()){
                ClassSection cxs = new ClassSection();
                cxs.setIdClassSection(rs.getInt("idSection"));
                cxs.setTotal(rs.getInt("total"));
                cxs.setName(rs.getString("name"));
                for(int i=0; i<students.size() ;i++){
                    if(students.get(i).getIdClassSection() == cxs.getIdClassSection())
                        cxs.addStudents(students.get(i));
                }
                for(int i=0; i<courses.size() ;i++){
                    if(courses.get(i).getIdClassSection() == cxs.getIdClassSection())
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
            ClassSection cxs = new ClassSection();
            int i=0;
            while(rs.next()){
                cxs.setIdClassSection(id);
                cxs.setTotal(rs.getInt("total"));
                cxs.setName(rs.getString("name"));
                CourseXSchedule c = new CourseXSchedule();
                ArrayList<CourseXSchedule> css = DBController.queryAllByIDCourseXSchedule(id);
                c.setIdCourseSchedule(rs.getInt("idCourseSchedule"));
                cxs.getCourses().add(c);

                for(int i=0; i<students.size() ;i++){
                    if(students.get(i).getIdClassSection() == cxs.getIdClassSection())
                        cxs.addStudents(students.get(i));
                }
                for(int i=0; i<courses.size() ;i++){
                    if(courses.get(i).getIdClassSection() == cxs.getIdClassSection())
                        cxs.addCourses(courses.get(i));
                }
                i++;
                classesSections.add(cxs);
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
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
