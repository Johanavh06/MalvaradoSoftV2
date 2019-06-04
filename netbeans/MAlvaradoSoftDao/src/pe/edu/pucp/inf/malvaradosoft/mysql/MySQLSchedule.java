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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Schedule;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOSchedule;

/**
 *
 * @author alulab14
 */
public class MySQLSchedule implements DAOSchedule{

    @Override
    public ArrayList<Schedule> queryAll() {
        ArrayList<Schedule> schedules = new ArrayList<Schedule>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Schedule";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Schedule s = new Schedule();
                s.setIdSchedule(rs.getInt("idSchedule"));
                schedules.add(s);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return schedules;
    }

    @Override
    public int insert(Schedule schedule) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertSchedule(?,?)}");
            cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setInt(2, schedule.getClassroom().getIdClassroom());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(Schedule schedule) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call updateSchedule(?,?)}");
            cs.setInt(1, schedule.getIdSchedule());
            cs.setInt(2, schedule.getClassroom().getIdClassroom());
            result= cs.executeUpdate();
            con.close();
            
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
            CallableStatement cs = con.prepareCall("{call deleteSchedule(?)}");
            cs.setInt(1,id);          
            result= cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

 
    
}
