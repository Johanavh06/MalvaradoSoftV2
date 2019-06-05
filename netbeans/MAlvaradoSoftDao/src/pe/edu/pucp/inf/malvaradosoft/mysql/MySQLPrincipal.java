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
import java.sql.Statement;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Principal;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOPrincipal;

/**
 *
 * @author alulab14
 */
public class MySQLPrincipal implements DAOPrincipal{

    @Override
    public ArrayList<Principal> queryAll() {
        ArrayList<Principal> principals = new ArrayList<Principal>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM principal";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Principal p = new Principal();
                p.setIdUser(rs.getInt("idPrincipal"));
                principals.add(p);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return principals;
    }

    @Override
    public int insert(Principal principal) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("" + "{call insertPrincipal(?)}");
            cs.setInt(1, principal.getIdUser());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(Principal principal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call deletePrincipal(?)}");
            cs.setInt(1,id);          
            result= cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }
    
}
