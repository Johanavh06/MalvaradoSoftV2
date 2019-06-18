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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Bimester;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public class MySQLYear implements DAOYear{

    @Override
    public int insertYear(Year_ y) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTYEAR(?,?)}");
            cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setInt(2, y.getYear());
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public ArrayList<Year_> queryAllYears() {
        ArrayList<Year_> years = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_BIMESTER where active = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Year_ y = new Year_();
                y.setIdYear(rs.getInt("idYear"));                
                y.setYear(rs.getInt ("year"));
                years.add(y);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return years;
    }

    @Override
    public int deleteYear(int idYear) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call MS_DELETEYEAR(?)}");
            cs.setInt(1, idYear);
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
