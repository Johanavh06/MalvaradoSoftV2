/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.TeacherXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public interface DAOTeacherXYear {
    int insertTeacherXYear (TeacherXYear txy);
    int deleteTeacherXYear (int id);
    ArrayList<TeacherXYear> queryAllTeachersXYear(Year_ y);
    ArrayList<TeacherXYear> queryAllTeachers();
    
}
