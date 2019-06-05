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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Workshop;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOWorkshop;

/**
 *
 * @author alulab14
 */
public class MySQLWorkshop implements DAOWorkshop{

    @Override
    public ArrayList<Workshop> queryAll() {
        ArrayList<Workshop> workshops = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllWorkshop()}");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Workshop w = new Workshop();
                w.setIdWorkshop(rs.getInt("idWorkshop"));
                w.setDescription(rs.getString("description"));
                w.getCourse().setName(rs.getString("nameCourse"));
                w.getCourse().setIdCourse(rs.getInt("idCourse"));
                w.getSchedule().setIdSchedule(rs.getInt("Schedule_idSchedule"));
                w.getTeacher().setIdUser(rs.getInt("idTeacher"));
                w.getTeacher().setNames((rs.getString("namesTeacher")));
                workshops.add(w);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return workshops;
    }

    @Override
    public int insertWorkshop(Workshop workshop) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call insertWorkshop(?,?,?,?,?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, workshop.getCourse().getIdCourse());
            cs.setInt(3, workshop.getTeacher().getIdUser());
            cs.setInt(4, workshop.getSchedule().getIdSchedule());
            cs.setString(5, workshop.getDescription());
            cs.executeUpdate();
            
            result = cs.getInt(1);
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateWorkshop(Workshop workshop) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call updateWorkshop(?,?,?,?,?)}");
            cs.setInt(1, workshop.getIdWorkshop());
            cs.setString(2, workshop.getDescription());
            cs.setInt(3, workshop.getTeacher().getIdUser());
            cs.setInt(4, workshop.getCourse().getIdCourse());
            cs.setInt(5, workshop.getSchedule().getIdSchedule());
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteWorkshop(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call deleteWorkshop(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
