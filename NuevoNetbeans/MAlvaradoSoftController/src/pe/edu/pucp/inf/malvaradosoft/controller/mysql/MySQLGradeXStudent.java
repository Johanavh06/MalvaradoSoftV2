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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOGradeXStudent;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Bimester;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.GradeXStudent;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public class MySQLGradeXStudent implements DAOGradeXStudent {

    @Override
    public ArrayList<GradeXStudent> queryAll() {
        ArrayList<GradeXStudent> gxss = new ArrayList<GradeXStudent>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_GRADEXSTUDENT WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                GradeXStudent gxs = new GradeXStudent();
                gxs.setValue(rs.getFloat("value"));
                gxs.setRegisterDate(rs.getDate("registerDate"));
                gxs.getBimester().setIdBimester(rs.getInt("idBimester"));
                gxs.getYear().setIdYear(rs.getInt("idYear"));
                gxs.getStudent().setIdUser(rs.getInt("idStudent"));
                gxs.getGrade().setIdGrade(rs.getInt("idGrade"));
                gxs.getCourse().setId(rs.getInt("idCourse"));
                                
                gxss.add(gxs);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return gxss;
    }

    @Override
    public ArrayList<GradeXStudent> queryByStudentCourse(Student student, Course course, Year_ year) {
        ArrayList<GradeXStudent> gxss = new ArrayList<GradeXStudent>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYGRADESBYSTUDENTANDCOURSE(?,?,?)}");
            cs.setInt("_IDSTUDENT", student.getIdUser());
            cs.setInt("_IDCOURSE", course.getId());
            cs.setInt("_IDYEAR", year.getIdYear());
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                GradeXStudent gxs = new GradeXStudent();
                gxs.setValue(rs.getFloat("value"));
                gxs.setRegisterDate(rs.getDate("registerDate"));
                gxs.getBimester().setIdBimester(rs.getInt("idBimester"));
                gxs.getYear().setIdYear(rs.getInt("idYear"));
                gxs.getStudent().setIdUser(rs.getInt("idStudent"));
                gxs.getGrade().setIdGrade(rs.getInt("idGrade"));
                gxs.getCourse().setId(rs.getInt("idCourse"));
                                
                gxss.add(gxs);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return gxss;
    }


    @Override
    public int insert(GradeXStudent gradeXStudent) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTGRADEXSTUDENT(?,?,?,?,?,?,?)}");
            
            cs.setInt("_IDBIMESTER", gradeXStudent.getBimester().getIdBimester());
            cs.setInt("_IDYEAR", gradeXStudent.getYear().getIdYear() );
            cs.setDouble("_IDSTUDENT", gradeXStudent.getStudent().getIdUser());
            cs.setInt("_IDGRADE", gradeXStudent.getGrade().getIdGrade());
            cs.setInt("_IDCOURSE", gradeXStudent.getCourse().getId());
            cs.setFloat("_VALUE", (float) gradeXStudent.getValue());
            cs.setDate("_REGISTERDATE", new java.sql.Date(gradeXStudent.getRegisterDate().getTime()));
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(GradeXStudent gradeXStudent) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATEGRADEXSTUDENT(?,?,?,?,?,?,?)}");
            
            cs.setInt("_IDBIMESTER", gradeXStudent.getBimester().getIdBimester());
            cs.setInt("_IDYEAR", gradeXStudent.getYear().getIdYear() );
            cs.setDouble("_IDSTUDENT", gradeXStudent.getStudent().getIdUser());
            cs.setInt("_IDGRADE", gradeXStudent.getGrade().getIdGrade());
            cs.setInt("_IDCOURSE", gradeXStudent.getCourse().getId());
            cs.setFloat("_VALUE", (float) gradeXStudent.getValue());
            cs.setDate("_REGISTERDATE", new java.sql.Date(gradeXStudent.getRegisterDate().getTime()));
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public ArrayList<GradeXStudent> queryByStudentCourseBimester(Student student, Course course, Bimester bimester, Year_ year) {
        ArrayList<GradeXStudent> gxss = new ArrayList<GradeXStudent>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYGRADESBYSTUDENTANDCOURSEANDCIMESTER(?,?,?,?)}");
            cs.setInt("_IDSTUDENT", student.getIdUser());
            cs.setInt("_IDCOURSE", course.getId());
            cs.setInt("_IDBIMESTER", bimester.getIdBimester());
            cs.setInt("_IDYEAR", year.getIdYear());
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                GradeXStudent gxs = new GradeXStudent();
                gxs.setValue(rs.getFloat("value"));
                gxs.setRegisterDate(rs.getDate("registerDate"));
                gxs.getBimester().setIdBimester(rs.getInt("idBimester"));
                gxs.getYear().setIdYear(rs.getInt("idYear"));
                gxs.getStudent().setIdUser(rs.getInt("idStudent"));
                gxs.getGrade().setIdGrade(rs.getInt("idGrade"));
                gxs.getCourse().setId(rs.getInt("idCourse"));
                                
                gxss.add(gxs);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return gxss;
    }

    @Override
    public int delete(int idGrade, int idStudent, int idCourse, int idBimester, int idYear) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATEGRADEXSTUDENT(?,?,?,?,?)}");
            
            cs.setInt("_IDBIMESTER", idBimester);
            cs.setInt("_IDYEAR", idYear);
            cs.setDouble("_IDSTUDENT", idStudent);
            cs.setInt("_IDGRADE", idGrade);
            cs.setInt("_IDCOURSE", idCourse);
            
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
