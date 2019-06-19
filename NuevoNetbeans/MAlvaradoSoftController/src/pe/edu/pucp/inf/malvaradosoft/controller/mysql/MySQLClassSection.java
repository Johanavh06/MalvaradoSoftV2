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
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;

/**
 *
 * @author alulab14
 */
public class MySQLClassSection implements DAOClassSection{

    @Override
    public ArrayList<ClassSection> queryAll() {
        ArrayList<ClassSection> classSections = new ArrayList<ClassSection>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_CLASSSECTION WHERE active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                ClassSection c = new ClassSection();
                c.setId(rs.getInt("idClassSection"));
                c.setTotal(rs.getInt("total"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                c.setSchedulePDF(rs.getByte("schedulePDF"));
                classSections.add(c);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return classSections;
    }

    @Override
    public ArrayList<ClassSection> queryByLevel(int level) {
        ArrayList<ClassSection> classSections = new ArrayList<ClassSection>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_CLASSSECTION WHERE active=1 and level = " + "" + level + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                ClassSection c = new ClassSection();
                c.setId(rs.getInt("idClassSection"));
                c.setTotal(rs.getInt("total"));
                c.setName(rs.getString("name"));
                c.setLevel(rs.getInt("level"));
                c.setSchedulePDF(rs.getByte("schedulePDF"));
                classSections.add(c);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return classSections;
    }

    @Override
    public int insert(ClassSection classSection) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCLASSSECTION(?,?,?,?,?)}");
            
            cs.registerOutParameter("_IDCLASSSECTION", java.sql.Types.INTEGER);
            cs.setInt("_TOTAL", classSection.getTotal());
            cs.setString("_NAME", classSection.getName());
            cs.setInt("_LEVEL", classSection.getLevel());                     
            Blob schedulePDF = new SerialBlob((byte[])classSection.getSchedulePDF());
            cs.setBlob("_SCHEDULEPDF", schedulePDF);
            result = cs.executeUpdate();
            
            classSection.setId(cs.getInt("_IDCLASSSECTION"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(ClassSection classSection) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_UPDATECLASSSECTION(?,?,?,?,?)}");
            cs.setInt("_IDCLASSSECTION", classSection.getId());
            cs.setInt("_TOTAL", classSection.getTotal());
            cs.setString("_NAME", classSection.getName());
            cs.setInt("_LEVEL", classSection.getLevel());                     
            Blob schedulePDF = new SerialBlob((byte[])classSection.getSchedulePDF());
            cs.setBlob("_SCHEDULEPDF", schedulePDF);  
            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int idclassSection) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETECLASSSECTION(?)}");
            cs.setInt("_IDCLASSSECTION", idclassSection);
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
