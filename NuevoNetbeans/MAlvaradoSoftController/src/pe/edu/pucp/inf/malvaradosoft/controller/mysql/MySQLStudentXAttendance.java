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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXAttendance> queryByStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXAttendance> queryByStudentObservation(Student student, String observation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
