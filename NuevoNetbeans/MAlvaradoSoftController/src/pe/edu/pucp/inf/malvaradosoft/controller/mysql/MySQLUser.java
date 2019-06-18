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
                u.setnAttempts(rs.getInt("nAttemps"));
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
                u.setnAttempts(rs.getInt("nAttemps"));
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
                user.setnAttempts(rs.getInt("nAttemps"));
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
                u.setnAttempts(rs.getInt("nAttemps"));
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
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYFIRSTLASTNAME(?)}");
            cs.setString(1,firstLastName);
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
                u.setnAttempts(rs.getInt("nAttemps"));
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
    public ArrayList<User> queryAllUsersBySecondLastName(String secondLastName) {
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYSECONDLASTNAME(?)}");
            cs.setString(1,secondLastName);
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
                u.setnAttempts(rs.getInt("nAttemps"));
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
    public ArrayList<User> queryAllUsersBlocked() {
        ArrayList<User> userList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBLOCKED()}");
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
                u.setnAttempts(rs.getInt("nAttemps"));
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
    public User queryAllUsersByUsername(String username) {
        User user = new User();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERSBYUSERNAME(?)}");
            cs.setString(1,username);
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
                user.setnAttempts(rs.getInt("nAttemps"));
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
    public int InsertUser(User user) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_INSERTUSER(?,?,?,?,?,?)}");
            
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, user.getNames());
            cs.setString(3, user.getFirstLastName());
            cs.setString(4, user.getSecondLastName());
            cs.setString(5, user.getDni());
            cs.setString(6, user.getAddress());
            cs.setInt(7, user.getCellPhone());
            cs.setString(8, user.getEmail());
            cs.setString(9, user.getUsername());
            cs.setString(10, user.getPassword());
            cs.setBoolean(11, user.isBlocked());
            cs.setTime(12, user.getBlockTime());
            cs.setInt(13, user.getnAttempts());
//            cs.setInt(14, user.getUserTypes().);
//            
//            cs.setInt(2, pokemon.getType().getIdTypePokemon());
//            cs.setString(3, pokemon.getName());
//            cs.setDouble(4, pokemon.getHeight());
//            cs.setDouble(5, pokemon.getWeight());
//            cs.setString(6, pokemon.getDescription());
//            
//            
//                u.setIdUser(rs.getInt("idUser"));
//                u.setNames(rs.getString("names"));
//                u.setFirstLastName(rs.getString("firstLastName"));
//                u.setSecondLastName(rs.getString("secondLastName"));
//                u.setDni(rs.getString("dni"));
//                u.setAddress(rs.getString("address"));
//                u.setCellPhone(rs.getInt("cellphone"));
//                u.setEmail(rs.getString("email"));
//                u.setUsername(rs.getString("userName"));
//                u.setPassword(rs.getString("password"));
//                u.setBlocked(rs.getBoolean("blocked"));
//                u.setBlockTime(rs.getTime("blockTime"));
//                u.setnAttempts(rs.getInt("nAttemps"));
//                UserType ut = new UserType();
//                ut.setIdUserType(rs.getInt("idUserType"));
//                ut.setDescription(rs.getString("description"));
//                u.setUserTypes(ut);
            
            result = cs.executeUpdate();
            //pokemon.setId(cs.getInt("_ID_STUDENT"));
            con.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
