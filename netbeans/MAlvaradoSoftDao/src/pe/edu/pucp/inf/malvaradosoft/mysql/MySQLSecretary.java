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
                temp = rs.getInt(1);
                secretaryId.add(temp);
            }
            
            String auxQuery = "(";
            for(int i = 0; i < secretaryId.size(); i++){
                String tempString = Integer.toString(secretaryId.get(i));
                if(i!=(secretaryId.size() - 1)){
                    auxQuery += tempString + ", ";
                }
                else{
                    auxQuery += ");";
                }
            }
            
            String sqlQuery = "SELECT * FROM user WHERE idUser IN " + auxQuery;
            Statement st = con.createStatement();
            
            ResultSet rs2 = st.executeQuery(sqlQuery);            
            
            while(rs2.next()){
                Secretary u = new Secretary();
                u.setIdUser(rs2.getInt("_idUser"));
                u.setDni(rs2.getString("_dni"));
                u.setEmail(rs2.getString("_email"));
                u.setNames(rs2.getString("_names"));
                u.setFirstLastName(rs2.getString("_firstLast Name"));
                u.setSecondLastName(rs2.getString("_secondLast Name"));
                u.setPassword(rs2.getString("_password"));
                u.setUserName(rs2.getString("_userName"));
                u.setPhone(rs2.getInt("_phone"));
                u.setAddress(rs2.getString("_adress"));
                secretaries.add(u);
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
            cs.setString(6, secretary.getAddress());
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
        int result = secretary.getIdUser();
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call updateUser(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, secretary.getIdUser());
            cs.setString(2, secretary.getNames());
            cs.setString(3, secretary.getFirstLastName());
            cs.setString(4, secretary.getSecondLastName());
            cs.setString(5, secretary.getDni());
            cs.setString(6, secretary.getAddress());
            cs.setInt(7, secretary.getPhone());
            cs.setString(8, secretary.getEmail());
            cs.setString(9, secretary.getUserName());
            cs.setString(10, secretary.getPassword());
            
            cs.executeQuery();
            
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id) {
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
