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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassroom;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Classroom;

/**
 *
 * @author alulab14
 */
public class MySQLClassroom implements DAOClassroom{

    @Override
    public ArrayList<Classroom> queryAll() {
        ArrayList<Classroom> classrooms = new ArrayList<Classroom>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_CLASSROOM WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Classroom c = new Classroom();
                c.setId(rs.getInt("idClassroom"));
                c.setName(rs.getString("name"));
                c.setCapacity(rs.getInt("capacity"));
                                
                classrooms.add(c);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return classrooms;
    }

    @Override
    public int insert(Classroom classroom) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCLASSROOM(?,?,?)}");
            
            cs.registerOutParameter("_IDCLASSROOM", java.sql.Types.INTEGER);
            cs.setString("_NAME", classroom.getName());
            cs.setInt("_CAPACITY", classroom.getCapacity());                     
            
            result = cs.executeUpdate();
            
            classroom.setId(cs.getInt("_IDCLASSROOM"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override//
    public int update(Classroom classroom) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATECLASROOM(?,?,?)}");
            cs.setInt("_IDCLASSROOM", classroom.getId());
            cs.setString("_NAME", classroom.getName());  
            cs.setInt("_CAPACITY", classroom.getCapacity());   
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override//
    public int delete(int idclassroom) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETECLASSROOM(?)}");
            cs.setInt("_IDCLASSROOM", idclassroom);
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
