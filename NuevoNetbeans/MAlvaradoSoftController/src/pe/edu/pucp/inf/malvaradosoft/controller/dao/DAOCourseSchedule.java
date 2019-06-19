/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.CourseSchedule;

/**
 *
 * @author Renato
 */
public interface DAOCourseSchedule {
    ArrayList <CourseSchedule> queryAll();
    ArrayList <CourseSchedule> queryById(int idCourse, int idClassSection);
    ArrayList <CourseSchedule> queryByTeacherId( int idTeacher);
    
    int insert(CourseSchedule courseSchedule);
    int update(CourseSchedule courseSchedule);
    int delete(int idCourseSchedule);
}
