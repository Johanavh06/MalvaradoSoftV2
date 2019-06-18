/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Bimester;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.GradeXStudent;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public interface DAOGradeXStudent {
    ArrayList <GradeXStudent> queryAll();
    ArrayList <GradeXStudent> queryByStudentCourse(Student student, Course course, Year_ year);
    ArrayList <GradeXStudent> queryByStudentCourseBimester(Student student, Course course, Bimester bimester, Year_ year);
    int insert(GradeXStudent gradeXStudent);
    int update(GradeXStudent gradeXStudent);
    int delete(int idGrade, int idStudent, int idCourse, int idBimester, int idYear);
}
