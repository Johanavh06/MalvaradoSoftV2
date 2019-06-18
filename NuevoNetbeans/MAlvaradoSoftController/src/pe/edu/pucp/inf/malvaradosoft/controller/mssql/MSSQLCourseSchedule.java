/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mssql;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourseSchedule;
import pe.edu.pucp.inf.malvaradosoft.model.bean.CourseSchedule;

/**
 *
 * @author alulab14
 */
public class MSSQLCourseSchedule implements DAOCourseSchedule{

    @Override
    public ArrayList<CourseSchedule> queryAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseSchedule> queryById(int idCourse, int idClassSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(CourseSchedule courseSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(CourseSchedule courseSchedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int idCourse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
