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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Event;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOEvent;

/**
 *
 * @author alulab14
 */
public class MySQLEvent implements DAOEvent {

    @Override
    public ArrayList<Event> queryAll() {
        ArrayList<Event> events = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Events WHERE active = 1"; //Solo se considerean los examenes que no están dados de baja
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Event e = new Event();
                
                e.setIdEvent(rs.getInt("idEvent"));
                e.setStartTime(rs.getDate("sartTime"));
                e.setEndTime(rs.getDate("endTime"));
                                
                events.add(e);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return events;
    }

    @Override
    public int insert(Event event) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertEvent(?,?,?)}");
            cs.registerOutParameter("_id", java.sql.Types.INTEGER);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            cs.setString("_startTime", formato.format(event.getStartTime()));
            cs.setString("_endTime", formato.format(event.getEndTime()));
            
            result= cs.executeUpdate();
            
            event.setIdEvent(cs.getInt("_id"));
                        
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(Event event) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call updateEvent(?,?,?)}");
            
            cs.setInt("_id", event.getIdEvent());
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            cs.setString("_startTime", formato.format(event.getStartTime()));
            cs.setString("_endTime", formato.format(event.getEndTime()));
            
            result = cs.executeUpdate();
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
            CallableStatement cs = con.prepareCall(""
                    + "{call deleteEvent(?)}");
			cs.setInt("_id", id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
