/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public class MySQLStudent implements  DAOStudent{

    @Override
    public ArrayList<Student> queryAllStudents() {
        ArrayList<Student> studentList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLSTUDENTS()}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Student u = new Student();
                u.setIdUser(rs.getInt("idUser"));
                u.setNames(rs.getString("names"));
                u.setFirstLastName(rs.getString("firstLastName"));
                u.setSecondLastName(rs.getString("secondLastName"));
                u.setDni(rs.getString("dni"));
                u.setAddress(rs.getString("address"));
                u.setCellPhone(rs.getInt("cellphone"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setBlocked(rs.getBoolean("blocked"));
                u.setBlockTime(rs.getTime("blockTime"));
                u.setnAttempts(rs.getInt("nAttemps"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                u.setUserTypes(ut);
                User guardian = new User();
                guardian.setIdUser(rs.getInt("idGuardian"));
                DBController.queryAllUsersByID(guardian.getIdUser());
                u.setGuardian(guardian);
                u.setStudyCertificate(rs.getByte("studyCertificate"));
                u.setBirthCertificate(rs.getByte("birthCertificate"));
                studentList.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return studentList;
    }

    @Override
    public ArrayList<Student> queryAllUsersByGuardian(User guardian) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //LA INSERCION DE UN ESTUDIANTE TAMBIEN INSERTA UN USUARIO(ESTUDIANTE)
    @Override
    public int InsertStudent(Student student) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_INSERTSTUDENT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, student.getNames());
            cs.setString(3, student.getFirstLastName());
            cs.setString(4, student.getSecondLastName());
            cs.setString(5, student.getDni());
            cs.setString(6, student.getAddress());
            cs.setInt(7, student.getCellPhone());
            cs.setString(8, student.getEmail());
            cs.setString(9, student.getUsername());
            cs.setString(10, student.getPassword());
            cs.setBoolean(11, student.isBlocked());
            cs.setTime(12, student.getBlockTime());
            cs.setInt(13, student.getnAttempts());
            UserType ut = new UserType();
            for(int i=0; i<student.getArrayUserTypes().size() ;i++ ){
                ut=student.getUserType(i);
                DBController.insertUserTypeXUser(student,ut);
            }
            cs.setInt(14,student.getGuardian().getIdUser());
            Blob pdf1 = new SerialBlob((byte[])student.getBirthCertificate());
            cs.setBlob(15, pdf1);
            Blob pdf2 = new SerialBlob((byte[])student.getStudyCertificate());
            cs.setBlob(16, pdf2);
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateStudent(Student student) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_UPDATESTUDENT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(2, student.getNames());
            cs.setString(3, student.getFirstLastName());
            cs.setString(4, student.getSecondLastName());
            cs.setString(5, student.getDni());
            cs.setString(6, student.getAddress());
            cs.setInt(7, student.getCellPhone());
            cs.setString(8, student.getEmail());
            cs.setString(9, student.getUsername());
            cs.setString(10, student.getPassword());
            cs.setBoolean(11, student.isBlocked());
            cs.setTime(12, student.getBlockTime());
            cs.setInt(13, student.getnAttempts());
            UserType ut = new UserType();
            for(int i=0; i<student.getArrayUserTypes().size() ;i++ ){
                ut=student.getUserType(i);
                DBController.insertUserTypeXUser(student,ut);
            }
            cs.setInt(14,student.getGuardian().getIdUser());
            Blob pdf1 = new SerialBlob((byte[])student.getBirthCertificate());
            cs.setBlob(15, pdf1);
            Blob pdf2 = new SerialBlob((byte[])student.getStudyCertificate());
            cs.setBlob(16, pdf2);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteStudent(Student student) {
        int result=0;
        try {
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_DELETESTUDENT(?)}");
            
            cs.setInt(1, student.getIdUser());
            result = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;	
    }
    
}
