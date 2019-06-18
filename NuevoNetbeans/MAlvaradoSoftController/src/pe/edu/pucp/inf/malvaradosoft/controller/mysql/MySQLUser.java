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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUser;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public class MySQLUser implements DAOUser{

    @Override
    public ArrayList<User> queryAllUsers() {
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERS()}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setIdUser(rs.getInt("idUser"));
                u.setNames(rs.getString("names"));
                u.setFirstLastName(rs.getString("firstLastName"));
                u.setSecondLastName(rs.getString("secondLastName"));
                u.setDni(rs.getString("dni"));
                u.setAddress(rs.getString("address"));
                u.setCellPhone(rs.getInt("cellphone"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setBlocked(rs.getBoolean("blocked"));
                u.setBlockTime(rs.getTime("blockTime"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                u.setUserTypes(ut);
                userList.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }

    @Override
    public ArrayList<User> queryAllUsersByUserType(UserType userType) {
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYUSERTYPE(?)}");
            cs.setInt(1,userType.getIdUserType());
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setIdUser(rs.getInt("idUser"));
                u.setNames(rs.getString("names"));
                u.setFirstLastName(rs.getString("firstLastName"));
                u.setSecondLastName(rs.getString("secondLastName"));
                u.setDni(rs.getString("dni"));
                u.setAddress(rs.getString("address"));
                u.setCellPhone(rs.getInt("cellphone"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setBlocked(rs.getBoolean("blocked"));
                u.setBlockTime(rs.getTime("blockTime"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                u.setUserTypes(ut);
                userList.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }

    @Override
    public User queryAllUsersByDNI(String dni) {
        User user = new User();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYDNI(?)}");
            cs.setString(1,dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                user.setIdUser(rs.getInt("idUser"));
                user.setNames(rs.getString("names"));
                user.setFirstLastName(rs.getString("firstLastName"));
                user.setSecondLastName(rs.getString("secondLastName"));
                user.setDni(rs.getString("dni"));
                user.setAddress(rs.getString("address"));
                user.setCellPhone(rs.getInt("cellphone"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setBlocked(rs.getBoolean("blocked"));
                user.setBlockTime(rs.getTime("blockTime"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                user.setUserTypes(ut);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return user;
    }

    @Override
    public ArrayList<User> queryAllUsersByName(String name) {
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYNAME(?)}");
            cs.setString(1,name);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setIdUser(rs.getInt("idUser"));
                u.setNames(rs.getString("names"));
                u.setFirstLastName(rs.getString("firstLastName"));
                u.setSecondLastName(rs.getString("secondLastName"));
                u.setDni(rs.getString("dni"));
                u.setAddress(rs.getString("address"));
                u.setCellPhone(rs.getInt("cellphone"));
                u.setEmail(rs.getString("email"));
                u.setUsername(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setBlocked(rs.getBoolean("blocked"));
                u.setBlockTime(rs.getTime("blockTime"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                u.setUserTypes(ut);
                userList.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }

    @Override
    public ArrayList<User> queryAllUsersByFirstLastName(String firstLastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> queryAllUsersBySecondLastName(String secondLastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> queryAllUsersBlocked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int InsertUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public User queryUserLogin(String username, String password){
        User user = new User();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYBYUSERNAME(?)}");
            cs.setString(1,username);
            ResultSet rs = cs.executeQuery();
            
            if (rs.next()){
                user.setIdUser(rs.getInt("idUser"));
                user.setNames(rs.getString("names"));
                user.setFirstLastName(rs.getString("firstLastName"));
                user.setSecondLastName(rs.getString("secondLastName"));
                user.setDni(rs.getString("dni"));
                user.setAddress(rs.getString("address"));
                user.setCellPhone(rs.getInt("cellphone"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setBlocked(rs.getBoolean("blocked"));
                user.setBlockTime(rs.getTime("blockTime"));
                UserType ut = new UserType();
                ut.setIdUserType(rs.getInt("idUserType"));
                ut.setDescription(rs.getString("description"));
                user.setUserTypes(ut);                                
                user.setnAttempts("nAttempts");
                if (password == user.getPassword()){
                    
                }else{ //Contraseña incorrecta
                    int nAtt = user.get
                }
                
                
            }else{ //No existe el usuario
                return null;
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return user;
    }
    
}
