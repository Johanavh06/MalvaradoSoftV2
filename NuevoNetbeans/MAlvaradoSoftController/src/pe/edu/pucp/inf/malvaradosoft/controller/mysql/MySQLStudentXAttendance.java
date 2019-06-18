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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXAttendance;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXAttendance;

/**
 *
 * @author alulab14
 */
public class MySQLStudentXAttendance implements DAOStudentXAttendance{

    @Override
    public ArrayList<StudentXAttendance> queryAll() {
        ArrayList<StudentXAttendance> sxas = new ArrayList<StudentXAttendance>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_STUDENTXATTENDANCE WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                StudentXAttendance sxa = new StudentXAttendance();
                sxa.getAttendance().setIdAttendance(rs.getInt("idAttendance"));
                sxa.setObservation(rs.getString("observation"));
                sxa.getYear().setIdYear(rs.getInt("idYear"));
                sxa.getStudent().setIdUser(rs.getInt("idStudent"));
                                
                sxas.add(sxa);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return sxas;
    }

    @Override
    public ArrayList<StudentXAttendance> queryByStudent(Student student) {
        ArrayList<StudentXAttendance> sxas = new ArrayList<StudentXAttendance>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYATTENDACEBYSTUDENT(?)}");
            cs.setInt("_IDSTUDENT", student.getIdUser());
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                StudentXAttendance sxa = new StudentXAttendance();
                sxa.getAttendance().setIdAttendance(rs.getInt("idAttendance"));
                sxa.setObservation(rs.getString("observation"));
                sxa.getYear().setIdYear(rs.getInt("idYear"));
                sxa.getStudent().setIdUser(rs.getInt("idStudent"));
                                
                sxas.add(sxa);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return sxas;
    }

    @Override
    public ArrayList<StudentXAttendance> queryByStudentObservation(Student student, String observation) {
        ArrayList<StudentXAttendance> sxas = new ArrayList<StudentXAttendance>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_QUERYATTENDACEBYSTUDENTANDOBS(?,?)}");
            cs.setInt("_IDSTUDENT", student.getIdUser());
            cs.setString("_OBSERVATION", observation);
            
            ResultSet rs = cs.executeQuery();
                        
            while(rs.next()){
                StudentXAttendance sxa = new StudentXAttendance();
                sxa.getAttendance().setIdAttendance(rs.getInt("idAttendance"));
                sxa.setObservation(rs.getString("observation"));
                sxa.getYear().setIdYear(rs.getInt("idYear"));
                sxa.getStudent().setIdUser(rs.getInt("idStudent"));
                                
                sxas.add(sxa);

            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return sxas;
    }

    @Override
    public int insert(StudentXAttendance studentXAttendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTSTUDENTXATTENDANCE(?,?,?,?)}");
            
            cs.setInt("_IDATTENDANCE", studentXAttendance.getAttendance().getIdAttendance());
            cs.setString("_OBSERVATION", studentXAttendance.getObservation());
            cs.setDouble("_IDYEAR", studentXAttendance.getYear().getIdYear());
            cs.setInt("_IDSTUDENT", studentXAttendance.getStudent().getIdUser());
            
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(StudentXAttendance studentXAttendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATESTUDENTXATTENDANCE(?,?,?,?)}");
            
            cs.setInt("_IDATTENDANCE", studentXAttendance.getAttendance().getIdAttendance());
            cs.setString("_OBSERVATION", studentXAttendance.getObservation());
            cs.setDouble("_IDYEAR", studentXAttendance.getYear().getIdYear());
            cs.setInt("_IDSTUDENT", studentXAttendance.getStudent().getIdUser());
            
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int idAttendance, int idStudent) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETESTUDENTXATTENDANCE(?,?)}");
            
            cs.setInt("_IDATTENDANCE", idAttendance);
            cs.setInt("_IDSTUDENT", idStudent);
            
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
