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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCondition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;

/**
 *
 * @author alulab14
 */
public class MySQLCondition implements DAOCondition{

    @Override
    public int insertCondition(Condition c) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTCONDITION(?,?)}");
            cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setString(2, c.getDescription());
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    
    }

    @Override
    public ArrayList<Condition> queryAllCondition() {
        ArrayList<Condition> cond = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_CONDITION where active = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Condition g = new Condition();
                g.setIdCondition(rs.getInt("idCondition"));
                g.setDescription(rs.getString("description"));
                cond.add(g);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cond;
    }

    @Override
    public Condition getCondition(int id) {        
        Condition cond = new Condition();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_CONDITION where idCondition = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
                        
            if(rs.next()){
                cond.setIdCondition(rs.getInt("idCondition"));
                cond.setDescription(rs.getString("description"));
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cond;
    }

    @Override
    public int deleteCondition(int id) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call MSDELETECONDITION(?)}");
            cs.setInt(1, id);
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    
}
