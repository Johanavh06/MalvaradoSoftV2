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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOTeacherXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.TeacherXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public class MySQLTeacherXYear implements DAOTeacherXYear {

    @Override
    public int insertTeacherXYear(TeacherXYear t) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTTEACHERXYEAR(?,?)}");
            cs.setInt(1, t.getIdTeacherXYear());
            cs.setInt(2, t.getYear().getIdYear());
            result= cs.executeUpdate();
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int deleteTeacherXYear(TeacherXYear t) {
        int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call MS_DELETETEACHERXYEAR(?,?)}");
            cs.setInt(1, t.getIdTeacherXYear());
            cs.setInt(1, t.getYear().getIdYear());
            result= cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public ArrayList<TeacherXYear> queryAllTeachersXYear(Year_ y) {
        ArrayList<TeacherXYear> tes = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall(""
                    + "{call MS_QUERYALLTEACHERSXYEAR(?)}");
            cs.setInt(1, y.getIdYear());
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                TeacherXYear t = new TeacherXYear();
                t.setIdTeacherXYear(rs.getInt("idTeacher"));
                t.getYear().setIdYear(rs.getInt("idYear"));
                t.getYear().setYear(rs.getInt("year"));
                tes.add(t);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tes;
    }

    @Override
    public ArrayList<TeacherXYear> queryAllTeachers() {
        ArrayList<TeacherXYear> tes = new ArrayList<>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT distinct * FROM MS_TEACHERXYEAR t, MS_YEAR y where active = 1 and y.idYear = t.idYear";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                TeacherXYear g = new TeacherXYear();
                g.setIdTeacherXYear(rs.getInt("idTeacher"));
                g.getYear().setIdYear(rs.getInt("idYear"));
                g.getYear().setYear(rs.getInt("year"));
                tes.add(g);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tes;
    }
    
}
