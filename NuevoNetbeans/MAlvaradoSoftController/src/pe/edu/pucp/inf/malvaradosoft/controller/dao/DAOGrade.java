/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Grade;

/**
 *
 * @author alulab14
 */
public interface DAOGrade {
    ArrayList <Grade> queryAllGrades();
    ArrayList <Grade> queryGradesByCourseId(Course course);
    ArrayList <Grade> queryGradesSearchByName(String description, Course course); // busca por nombre
    int insert(Grade grade);
    int update(Grade grade);
    int delete(int id);
}
