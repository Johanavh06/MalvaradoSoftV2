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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.StudentXWorkshop;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOStudentXWorkshop;

/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public class MySQLStudentXWorkshop implements DAOStudentXWorkshop{

    @Override
    public ArrayList<StudentXWorkshop> queryAll() {
        ArrayList<StudentXWorkshop> studentWorkshops = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllStudentXWorkshop()}");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                StudentXWorkshop w = new StudentXWorkshop();
                w.getStudent().setIdUser(rs.getInt("idStudent"));
                w.getStudent().setNames(rs.getString("names"));
                w.getWorkshop().setIdWorkshop(rs.getInt("idWorkshop"));
                w.getWorkshop().setDescription(rs.getString("description"));
                studentWorkshops.add(w);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return studentWorkshops;
    }

    @Override
    public int insertStudentXWorkshop(StudentXWorkshop sxworkshop) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call insertStudentXWorkshop(?,?,?)}");
            cs.setInt(1, sxworkshop.getStudent().getIdUser());
            cs.setInt(2, sxworkshop.getWorkshop().getIdWorkshop());
            cs.setString(3, sxworkshop.getNumberTicket());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;        
    }

    @Override
    public int updateStudentXWorkshop(StudentXWorkshop sxworkshop) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call updateStudentXWorkshop(?,?,?)}");
            cs.setInt(1, sxworkshop.getStudent().getIdUser());
            cs.setInt(2, sxworkshop.getWorkshop().getIdWorkshop());
            cs.setString(3, sxworkshop.getNumberTicket());
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public int deleteStudentXWorkshop(int idStudent, int idWorkshop) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call deleteStudentXWorkshop(?,?)}");
            cs.setInt(1, idStudent);
            cs.setInt(2, idWorkshop);
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
