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
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserTypeXUser;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;


/**
 *
 * @author alulab14
 */
public class MySQLUserTypeXUser implements DAOUserTypeXUser{

    @Override
    public ArrayList<UserType> queryAllTypesXUser(User user) {
        ArrayList<UserType> typeList = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_QUERYALLUSERTYPESBYUSER(?)}");
            cs.setInt(1,user.getIdUser());
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                UserType u = new UserType();
                u.setIdUserType(rs.getInt("idUserType"));
                u.setDescription(rs.getString("description"));
                typeList.add(u);
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return typeList;
    }

    @Override
    public int insertUserTypeXUser(User user, UserType userType) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_INSERTUSERTYPEXUSER(?,?)}");
            cs.setInt(1,user.getIdUser());
            cs.setInt(2,userType.getIdUserType());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteUserTypeXUser(User user, UserType userType) {
        int result=0;
        try {
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_DELETEUSERTYPEXUSER(?,?)}");
            cs.setInt(1,user.getIdUser());
            cs.setInt(2,userType.getIdUserType());
            result = cs.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUserTypeXUser(User user, UserType userType) {
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{ call MS_UPDATEUSERTYPEXUSER(?,?)}");
            cs.setInt(1,user.getIdUser());
            cs.setInt(2,userType.getIdUserType());
            
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
