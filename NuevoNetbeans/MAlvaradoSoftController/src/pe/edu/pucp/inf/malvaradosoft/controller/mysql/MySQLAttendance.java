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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOAttendance;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Attendance;

/**
 *
 * @author alulab14
 */
public class MySQLAttendance implements DAOAttendance {

    @Override
    public ArrayList<Attendance> queryAll() {
        ArrayList<Attendance> attendances = new ArrayList<Attendance>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_ATTENDACE WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Attendance a = new Attendance();
                a.setIdAttendance(rs.getInt("idAttendance"));
                a.setDate(rs.getDate("date"));
                                
                attendances.add(a);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return attendances;
    }

    @Override
    public int insert(Attendance attendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTATTENDANCE(?,?)}");
            
            cs.registerOutParameter("_ID", java.sql.Types.INTEGER);
            cs.setDate("_DATE", new java.sql.Date(attendance.getDate().getTime()) );
            result = cs.executeUpdate();
            
            attendance.setIdAttendance(cs.getInt("_ID"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Attendance attendance) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATEATTENDANCE(?,?)}");
            
            cs.setInt("_ID", attendance.getIdAttendance());
            cs.setDate("_DATE", new java.sql.Date(attendance.getDate().getTime()) );
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETEATTENDANCE(?)}");
            
            cs.setInt("_ID", id);
            
            result = cs.executeUpdate();
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
