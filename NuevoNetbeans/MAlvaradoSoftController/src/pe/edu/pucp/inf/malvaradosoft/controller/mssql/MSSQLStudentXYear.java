/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mssql;

import java.time.Year;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXYear;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public class MSSQLStudentXYear implements DAOStudentXYear{

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYearByCondition(Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllStudentXYearByYear(Year year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllUsersByClassSection(ClassSection clasSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentXYear> queryAllUsersByNotEmptyTicketEnrollment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int InsertStudentXYear(StudentXYear studentXYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateStudentXYear(StudentXYear studentXYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteStudentXYear(StudentXYear studentXYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
