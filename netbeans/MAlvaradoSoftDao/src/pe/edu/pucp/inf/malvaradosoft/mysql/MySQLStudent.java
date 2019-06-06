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
import java.sql.Types;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.ClassSection;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Guardian;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.config.DAOFactory;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOStudent;

/**
 *
 * @author alulab14
 */
public class MySQLStudent implements DAOStudent{

    @Override
    public ArrayList<Student> queryAll() {
        ArrayList<Student> students = new ArrayList<Student>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "{CALL queryAllStudents()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Student student = new Student();
                student.setCondition(rs.getString("condition"));
                student.setIdUser(rs.getInt("idStudent"));
                DAOFactory factory = DAOFactory.getDAOFactory();
                Guardian guardian = factory.getGuardianDAO().queryGuardianById(rs.getInt("idGuardian"));
                student.setGuardian(guardian);
                ClassSection classSection = factory.getClassSectionDAO().queryAllByIDClassSection(rs.getInt("idClassSection"));
                student.setClassSection(classSection);
                student.setTicketNumerEnrollment(rs.getString("ticketNumerEnrollment"));
                student.setNames(rs.getString("names"));
                student.setSecondLastName(rs.getString("_secondLast Name"));
                student.setDni(rs.getString("dni"));
                student.setAddress(rs.getString("_adress"));
                student.setPhone(rs.getInt("_phone"));
                student.setEmail(rs.getString("email"));
                student.setUserName(rs.getString("_userName"));
                student.setPassword(rs.getString("_password"));
                
                students.add(student);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return students;
    }

    @Override
    public int insert(Student student) {
        int result = student.getIdUser();
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call INSERT_SECRETARY(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, student.getNames());
            cs.setString(3, student.getFirstLastName());
            cs.setString(4, student.getSecondLastName());
            cs.setString(5, student.getDni());
            cs.setString(6, student.getAddress());
            cs.setInt(7, student.getPhone());
            cs.setString(8, student.getEmail());
            cs.setString(9, student.getUserName());
            cs.setString(10, student.getPassword());
            cs.setString(11, student.getCondition());
            cs.setInt(12, student.getGuardian().getIdUser());
            cs.setInt(13, student.getClassSection().getIdClassSection());
            cs.setString(14, student.getTicketNumerEnrollment());
            
            cs.executeUpdate();
            
            result = cs.getInt(1);
            con.close();
            con.close();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Student student) {
        int result = student.getIdUser();
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call updateUser(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, student.getIdUser());
            cs.setString(2, student.getNames());
            cs.setString(3, student.getFirstLastName());
            cs.setString(4, student.getSecondLastName());
            cs.setString(5, student.getDni());
            cs.setString(6, student.getAddress());
            cs.setInt(7, student.getPhone());
            cs.setString(8, student.getEmail());
            cs.setString(9, student.getUserName());
            cs.setString(10, student.getPassword());
            
            cs.executeQuery();
            
            Connection con2 = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "{CALL updateStudent(?,?);}";
            CallableStatement cs2 = con2.prepareCall(sql);
            cs2.setInt("idStudent", student.getIdUser());
            cs2.setString(2, student.getCondition());
            cs2.executeQuery();
            
            DAOFactory factory = DAOFactory.getDAOFactory();
            factory.getGuardianDAO().update(student.getGuardian());
            factory.getClassSectionDAO().updateClassSection(student.getClassSection());
            
            con.close();
            con2.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call deleteUser(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
