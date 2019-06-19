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
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOBimesterXStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Bimester;
import pe.edu.pucp.inf.malvaradosoft.model.bean.BimesterXStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;


/**
 *
 * @author Renato
 */
public class MySQLBimesterXStudentXYear implements DAOBimesterXStudentXYear{

    @Override
    public ArrayList<BimesterXStudentXYear> queryAll() {
        ArrayList<BimesterXStudentXYear> bimesterXStudentsXYear = new ArrayList<BimesterXStudentXYear>();
        try{
            DBManager dbManager= DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT B.names,A.idStudent,C.valorBimester,A.idBimester,D.year,A.idYear "
                    + " FROM MS_BIMESTERXSTUDENTXYEAR A INNER JOIN MS_USER B ON A.idStudent=B.idUser"
                    + " INNER JOIN MS_BIMESTER C ON A.idBimester=C.idBimester INNER JOIN"
                    + " MS_YEAR D ON A.idYear=D.idYear WHERE A.active=1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                BimesterXStudentXYear bsy = new BimesterXStudentXYear();
                Bimester b = new Bimester();
                Student s=new Student();
                Year_ y = new Year_();
                b.setIdBimester(rs.getInt("idBimester"));
                b.setValorBimester(rs.getInt("valorBimester"));
                s.setNames(rs.getString("names"));
                s.setIdUser(rs.getInt("idStudent"));
                y.setIdYear(rs.getInt("idYear"));
                y.setYear(rs.getInt("year"));
                bsy.setStudent(s);
                bsy.setBimester(b);
                bsy.setYear(y);                                
                bimesterXStudentsXYear.add(bsy);
            }
            con.close();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return bimesterXStudentsXYear;
    }

    @Override
    public int insert(BimesterXStudentXYear bimesterXStudentXYear) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_INSERTBIMESTERXSTUDENTXYEAR(?,?,?)}");
            
            cs.setInt("_IDBIMESTER", bimesterXStudentXYear.getBimester().getIdBimester());
            cs.setInt("_IDSTUDENT", bimesterXStudentXYear.getStudent().getIdUser());
            cs.setInt("_IDYEAR", bimesterXStudentXYear.getYear().getIdYear());                     
            
            result = cs.executeUpdate();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(BimesterXStudentXYear bimesterXStudentXYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(BimesterXStudentXYear bimesterXStudentXYear) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(
            dbManager.getUrl(), 
            dbManager.getUser(), 
            dbManager.getPassword());
            CallableStatement cs = con.prepareCall("{call MS_DELETEBIMESTERXSTUDENTXYEAR(?,?,?)}");
            cs.setInt("_IDBIMESTER", bimesterXStudentXYear.getBimester().getIdBimester());
            cs.setInt("_IDSTUDENT", bimesterXStudentXYear.getStudent().getIdUser());
            cs.setInt("_IDYEAR", bimesterXStudentXYear.getYear().getIdYear()); 
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
