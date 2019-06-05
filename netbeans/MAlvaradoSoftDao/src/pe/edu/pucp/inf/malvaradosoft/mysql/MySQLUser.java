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
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOUser;

/**
 *
 * @author alulab14
 */
public class MySQLUser implements DAOUser{

    @Override
    public ArrayList<User> queryAll() {
        ArrayList<User> users = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllUser()}");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                User u = new User();
<<<<<<< HEAD
                u.setIdUser(rs.getInt("_idUser"));
                u.setDni(rs.getString("_dni"));
                u.setEmail(rs.getString("_email"));
                u.setNames(rs.getString("_names"));
                u.setFirstLastName(rs.getString("_firstLast Name"));
                u.setSecondLastName(rs.getString("_secondLast Name"));
                u.setPassword(rs.getString("_password"));
                u.setUserName(rs.getString("_userName"));
                u.setPhone(rs.getInt("_phone"));
                u.setAddress(rs.getString("_adress"));
=======
                u.setIdUser(rs.getInt("idUser"));
                u.setDni(rs.getString("dni"));
                u.setEmail(rs.getString("email"));
                u.setNames(rs.getString("names"));
                u.setFirstLastName(rs.getString("firstLastName"));
                u.setSecondLastName(rs.getString("secondLastName"));
                u.setPassword(rs.getString("password"));
                u.setUserName(rs.getString("userName"));
                u.setPhone(rs.getInt("phone"));
                u.setAdress(rs.getString("address"));
>>>>>>> 973c0187b675bb0673a29b063678efe1c7a8c86e
                users.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return users;
        
    }

    @Override
    public int insertUser(User user) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
<<<<<<< HEAD
            CallableStatement cs = con.prepareCall("" + "{call insertTeacher(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, user.getIdUser());
            cs.setString(2, user.getNames());
            cs.setString(3, user.getFirstLastName());
            cs.setString(4, user.getSecondLastName());
            cs.setString(5, user.getDni());
            cs.setString(6, user.getAddress());
            cs.setInt(7, user.getPhone());
            cs.setString(8, user.getEmail());
            cs.setString(9, user.getUserName());
            cs.setString(10, user.getPassword());
=======
            CallableStatement cs = con.prepareCall("" + "{call insertUser(?,?,?,?,?,?,?,?,?)}");            
            cs.setString(1, user.getNames());
            cs.setString(2, user.getFirstLastName());
            cs.setString(3, user.getSecondLastName());
            cs.setString(4, user.getDni());
            cs.setString(5, user.getAdress());
            cs.setInt(6, user.getPhone());
            cs.setString(7, user.getEmail());
            cs.setString(8, user.getUserName());
            cs.setString(9, user.getPassword());
>>>>>>> 973c0187b675bb0673a29b063678efe1c7a8c86e
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
        
    }

    @Override
    public int updateUser(User user) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call updateUser(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, user.getIdUser());
            cs.setString(2, user.getNames());
            cs.setString(3, user.getFirstLastName());
            cs.setString(4, user.getSecondLastName());
            cs.setString(5, user.getDni());
            cs.setString(6, user.getAddress());
            cs.setInt(7, user.getPhone());
            cs.setString(8, user.getEmail());
            cs.setString(9, user.getUserName());
            cs.setString(10, user.getPassword());
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteUser(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call deleteUser(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
        
    }
    
}
