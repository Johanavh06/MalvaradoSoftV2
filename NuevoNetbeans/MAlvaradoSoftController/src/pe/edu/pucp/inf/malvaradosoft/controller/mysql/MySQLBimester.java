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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOBimester;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Bimester;

/**
 *
 * @author alulab14
 */
public class MySQLBimester implements DAOBimester{

    @Override
    public int insertBimester(Bimester b) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTBIMESTER(?,?)}");
            cs.registerOutParameter(1,  java.sql.Types.INTEGER);
            cs.setInt(2, b.getValorBimester());
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public ArrayList<Bimester> queryAllBimester() {
        ArrayList<Bimester> bim = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM MS_BIMESTER where active = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Bimester b = new Bimester();
                b.setIdBimester(rs.getInt("idBimester"));                
                b.setValorBimester(rs.getInt("valorBimester"));
                bim.add(b);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return bim;
    }
}
