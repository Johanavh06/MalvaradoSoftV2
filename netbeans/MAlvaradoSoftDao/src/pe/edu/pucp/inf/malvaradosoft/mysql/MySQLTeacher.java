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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Teacher;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOTeacher;

/**
 *
 * @author alulab14
 */
public class MySQLTeacher implements DAOTeacher {

    @Override
    public ArrayList<Teacher> queryAll() {
       ArrayList<Teacher> teachers = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllTeacher()}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Teacher t = new Teacher();
                t.setIdUser(rs.getInt("_idUser"));
                t.setDni(rs.getString("_dni"));
                t.setEmail(rs.getString("_email"));
                t.setNames(rs.getString("_names"));
                t.setFirstLastName(rs.getString("_firstLast Name"));
                t.setSecondLastName(rs.getString("_secondLast Name"));
                t.setPassword(rs.getString("_password"));
                t.setUserName(rs.getString("_userName"));
                t.setPhone(rs.getInt("_phone"));
                t.setAddress(rs.getString("_adress"));
                teachers.add(t);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return teachers;
        
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call insertTeacher(?)}");
            cs.setInt(1, teacher.getIdUser());
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        int result = 0;
        return result;
    }

    @Override
    public int deleteTeacher(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call deleteTeacher(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
