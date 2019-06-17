/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.time.Year;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXYear;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public interface DAOStudentXYear {
    ArrayList<StudentXYear> queryAllStudentXYear();
    ArrayList<StudentXYear> queryAllStudentXYearByCondition(Condition condition);
    ArrayList<StudentXYear> queryAllStudentXYearByYear(Year year);
    ArrayList<StudentXYear> queryAllUsersByClassSection(ClassSection clasSection);
    ArrayList<StudentXYear> queryAllUsersByNotEmptyTicketEnrollment();
    int InsertStudentXYear(StudentXYear studentXYear);
    int updateStudentXYear(StudentXYear studentXYear);
    int deleteStudentXYear(StudentXYear studentXYear);
}
