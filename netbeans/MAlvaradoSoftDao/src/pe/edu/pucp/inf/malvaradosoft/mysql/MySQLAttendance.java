/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Attendance;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOAttendance;

/**
 *
 * @author WIN10
 */
public class MySQLAttendance implements DAOAttendance {

    public ArrayList<Attendance> queryAll() {
        ArrayList<Attendance> attendances = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Attendance WHERE active = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Attendance a = new Attendance();
                a.setIdAttendance(rs.getInt("idAttendance"));
                a.setDateTime(rs.getDate("dateTime"));
                attendances.add(a);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return attendances;
    }
    
    @Override
    public int updateAttendance(Attendance attendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call updateAttendance(?,?)}");
            cs.setInt("_idAttendance", attendance.getIdAttendance());
            cs.setDate("_date",new java.sql.Date(attendance.getDateTime().getTime()));
         
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteAttendance(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call deleteAttedance(?)}");
            cs.setInt("_idAttendance", id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int insertAttendance(Attendance attendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertAttendance(?,?)}");
            cs.registerOutParameter("_idAttendance", java.sql.Types.INTEGER);
            cs.setDate("_date",new java.sql.Date(attendance.getDateTime().getTime()));   
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
