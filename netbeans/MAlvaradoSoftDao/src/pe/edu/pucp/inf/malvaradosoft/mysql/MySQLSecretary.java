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
import java.sql.Types;
import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Secretary;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOSecretary;

/**
 *
 * @author alulab14
 */
public class MySQLSecretary implements DAOSecretary{

    @Override
    public ArrayList<Secretary> queryAll() {
        ArrayList<Secretary> secretaries = new ArrayList<>();
        ArrayList<Integer> secretaryId = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllSecretary()}");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                int temp;
                
            }
            
            while(rs.next()){
                User u = new User();
                u.setIdUser(rs.getInt("_idUser"));
                u.setDni(rs.getString("_dni"));
                u.setEmail(rs.getString("_email"));
                u.setNames(rs.getString("_names"));
                u.setFirstLastName(rs.getString("_firstLast Name"));
                u.setSecondLastName(rs.getString("_secondLast Name"));
                u.setPassword(rs.getString("_password"));
                u.setUserName(rs.getString("_userName"));
                u.setPhone(rs.getInt("_phone"));
                u.setAdress(rs.getString("_adress"));
                users.add(u);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return secretaries;
    }

    @Override
    public int insert(Secretary secretary) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call INSERT_SECRETARY(?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, secretary.getNames());
            cs.setString(3, secretary.getFirstLastName());
            cs.setString(4, secretary.getSecondLastName());
            cs.setString(5, secretary.getDni());
            cs.setString(6, secretary.getAdress());
            cs.setInt(7, secretary.getPhone());
            cs.setString(8, secretary.getEmail());
            cs.setString(9, secretary.getUserName());
            cs.setString(10, secretary.getPassword());
            
            cs.executeUpdate();
            
            result = cs.getInt(1);
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Secretary secretary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
