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
import java.time.Year;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public class MySQLStudentXYear implements DAOStudentXYear{

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYear() {
        ArrayList<StudentXYear> studentList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLSTUDENTXYEAR()}");
            ResultSet rs = cs.executeQuery();
            StudentXYear sy = new StudentXYear();
            Student u =sy.getStudent();
            while(rs.next()){
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
                Condition c = new Condition();
                c.setIdCondition(rs.getInt("idCondition"));
                //DBController.queryCOnditionByID(c.getIdCondition());
                sy.setCondition(c);
                sy.setTicketEnrollment(rs.getString("ticketEnrollment"));
                ClassSection clas = new ClassSection();
                clas.setId(rs.getInt("idClassSection"));
                //DBController.queryClassSectionByID(class.getId());
                sy.setClassSection(clas);
                studentList.add(sy);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return studentList;
    }

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYearByCondition(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYearByYear(Year year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllUsersByClassSection(ClassSection clasSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllUsersByNotEmptyTicketEnrollment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int InsertStudentXYear(StudentXYear studentXYear) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_INSERTSTUDENTXYEAR(?,?,?,?,?)}");
            DBController.InsertStudent(studentXYear.getStudent());
            cs.setInt(1, studentXYear.getYear().getIdYear());
            cs.setInt(2, studentXYear.getCondition().getIdCondition());
            cs.setString(3, studentXYear.getTicketEnrollment());
            cs.setInt(4, studentXYear.getClassSection().getId());
            cs.setInt(5, studentXYear.getStudent().getIdUser());
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateStudentXYear(StudentXYear studentXYear) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_UPDATESTUDENTXYEAR(?,?,?,?,?)}");
            DBController.updateStudent(studentXYear.getStudent());
            cs.setInt(1, studentXYear.getYear().getIdYear());
            cs.setInt(2, studentXYear.getCondition().getIdCondition());
            cs.setString(3, studentXYear.getTicketEnrollment());
            cs.setInt(4, studentXYear.getClassSection().getId());
            cs.setInt(5, studentXYear.getStudent().getIdUser());
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteStudentXYear(StudentXYear studentXYear) {
        int result=0;
        try {
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_DELETESTUDENTXYEAR(?)}");
            
            cs.setInt(1, studentXYear.getStudent().getIdUser());
            result = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;	
    }
    
}
