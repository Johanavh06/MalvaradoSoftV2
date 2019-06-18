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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOEvent;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Event;

/**
 *
 * @author alulab14
 */
public class MySQLEvent implements DAOEvent {

    @Override
    public int insertEvent(Event e) {
        int result= 0;
        try{
            
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCONDITION(?,?)}");
            /*cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setInt(2, e.getCourseSchedule().getId());
            cs.setInt(3, e.getDay());
            cs.setInt(4, e.getStartTime());
            cs.setInt(5, e.getEndTime());
            result= cs.executeUpdate();*/
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteEvent(Event e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Event> queryAllEventsByCourse(int idCourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Event> queryAllEventsByDay(int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
