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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Auxiliar;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOAuxiliar;

/**
 *
 * @author alulab14
 */
public class MySQLAuxiliar implements DAOAuxiliar{

    @Override
    public ArrayList<Auxiliar> queryAll() {
        ArrayList<Auxiliar> auxiliars = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Auxiliar A, user U WHERE U.idUser = A.idAuxiliar";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Auxiliar a = new Auxiliar();
                a.setIdUser(rs.getInt("idUser"));
                a.setNames(rs.getString("name"));
                a.setFirstLastName(rs.getString("firstLastName"));
                a.setSecondLastName(rs.getString("secondLastName"));
                a.setDni(rs.getString("User_DNI"));
                a.setAddress(rs.getString("address"));
                a.setPhone(rs.getInt("phone"));
                a.setEmail(rs.getString("email"));
                a.setUserName(rs.getString("userName"));
                a.setPassword(rs.getString("password"));
                auxiliars.add(a);
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return auxiliars;
    }

    @Override
    public Auxiliar queryAllByIDAuxiliar(int idAux) {
        Auxiliar auxiliar = new Auxiliar();
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllByNameAuxiliar(?)}");//,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, idAux); 
            //cs.setInt(1, auxiliar.getIdUser());
            cs.setString(2, auxiliar.getNames());
            cs.setString(3, auxiliar.getFirstLastName());
            cs.setString(4, auxiliar.getSecondLastName());
            cs.setString(5, auxiliar.getDni());
            cs.setString(6, auxiliar.getAddress());
            cs.setInt(7, auxiliar.getPhone());
            cs.setString(8, auxiliar.getEmail());
            cs.setString(9, auxiliar.getUserName());
            cs.setString(10, auxiliar.getPassword()); 
            result = cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return auxiliar;
    }

    @Override
    public Auxiliar queryAllByNameAuxiliar(String name) {
        Auxiliar auxiliar = new Auxiliar();
        int result = 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call queryAllByNameAuxiliar(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, name); 
            cs.setInt(1, auxiliar.getIdUser());
            cs.setString(2, auxiliar.getNames());
            cs.setString(3, auxiliar.getFirstLastName());
            cs.setString(4, auxiliar.getSecondLastName());
            cs.setString(5, auxiliar.getDni());
            cs.setString(6, auxiliar.getAddress());
            cs.setInt(7, auxiliar.getPhone());
            cs.setString(8, auxiliar.getEmail());
            cs.setString(9, auxiliar.getUserName());
            cs.setString(10, auxiliar.getPassword());
            result = cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return auxiliar;
    }
    
    @Override
    public int insertAuxiliar(Auxiliar auxiliar) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertAuxilliar(?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_idUser", java.sql.Types.INTEGER);
            //cs.setInt(1, auxiliar.getIdUser());
            cs.setString(2, auxiliar.getNames());
            cs.setString(3, auxiliar.getFirstLastName());
            cs.setString(4, auxiliar.getSecondLastName());
            cs.setString(5, auxiliar.getDni());
            cs.setString(6, auxiliar.getAddress());
            cs.setInt(7, auxiliar.getPhone());
            cs.setString(8, auxiliar.getEmail());
            cs.setString(9, auxiliar.getUserName());
            cs.setString(10, auxiliar.getPassword());   
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int updateAuxiliar(Auxiliar auxiliar) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call updateAuxilliar(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, auxiliar.getIdUser());
            cs.setString(2, auxiliar.getNames());
            cs.setString(3, auxiliar.getFirstLastName());
            cs.setString(4, auxiliar.getSecondLastName());
            cs.setString(5, auxiliar.getDni());
            cs.setString(6, auxiliar.getAddress());
            cs.setInt(7, auxiliar.getPhone());
            cs.setString(8, auxiliar.getEmail());
            cs.setString(9, auxiliar.getUserName());
            cs.setString(10, auxiliar.getPassword());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteAuxiliar(int id) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call deleteAuxiliar(?)}");
            cs.setInt(1, id);            
            result = cs.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

}
