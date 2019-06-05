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

                t.setIdUser(rs.getInt("idUser"));
                t.setDni(rs.getString("dni"));
                t.setEmail(rs.getString("email"));
                t.setNames(rs.getString("names"));
                t.setFirstLastName(rs.getString("firstLastName"));
                t.setSecondLastName(rs.getString("secondLastName"));
                t.setPassword(rs.getString("password"));
                t.setUserName(rs.getString("userName"));
                t.setPhone(rs.getInt("phone"));
                t.setAddress(rs.getString("address"));
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
            CallableStatement cs = con.prepareCall("" + "{call insertTeacher(?,?,?,?,?,?,?,?,?,?)}");
            
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, teacher.getNames());
            cs.setString(3, teacher.getFirstLastName());
            cs.setString(4, teacher.getSecondLastName());
            cs.setString(5, teacher.getDni());
            cs.setString(6, teacher.getAddress());
            cs.setInt(7, teacher.getPhone());
            cs.setString(8, teacher.getEmail());
            cs.setString(9, teacher.getUserName());
            cs.setString(10, teacher.getPassword());
            
            cs.executeUpdate();
            
            result = cs.getInt(1);
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return 1;
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
