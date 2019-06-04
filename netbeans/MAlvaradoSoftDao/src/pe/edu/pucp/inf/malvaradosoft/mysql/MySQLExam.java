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
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Exam;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Teacher;
import pe.edu.pucp.inf.malvaradosoft.config.DBManager;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOExam;

/**
 *
 * @author alulab14
 */
public class MySQLExam implements DAOExam{

    @Override
    public ArrayList<Exam> queryAll() {
        ArrayList<Exam> exams = new ArrayList<Exam>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM Exam WHERE active = 1"; //Solo se considerean los examenes que no están dados de baja
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Exam s = new Exam();

                s.setIdExam(rs.getInt("idExam"));
                s.getCourse().setIdCourse(rs.getInt("idCourse"));
                s.getTeacher().setIdUser(rs.getInt("idTeacher"));
                s.setDescription(rs.getString("description"));
                s.setState(rs.getInt("state"));
                                
                exams.add(s);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return exams;
    }

    @Override
    public int insert(Exam exam) {
         int result= 0;
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call insertExam(?,?,?,?,?)}");
            cs.registerOutParameter("_id", java.sql.Types.INTEGER);
            cs.setInt("_idCourse", exam.getCourse().getIdCourse());
            cs.setInt("_idTeacher", exam.getTeacher().getIdUser());
            cs.setInt("_sate", exam.getState());
            
            result= cs.executeUpdate();
            
            exam.setIdExam(cs.getInt("_id"));
                        
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }

    @Override
    public int update(Exam exam) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call updateExam(?,?,?,?)}");
            cs.setInt("_idCourse", exam.getCourse().getIdCourse());
            cs.setInt("_idTeacher", exam.getTeacher().getIdUser());
            cs.setInt("_sate", exam.getState());
            
            result = cs.executeUpdate();
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
            CallableStatement cs = con.prepareCall(""
                    + "{call deleteExam(?)}");
			cs.setInt("_id", id);
            result= cs.executeUpdate();
            con.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    return result;
    }
    
}
