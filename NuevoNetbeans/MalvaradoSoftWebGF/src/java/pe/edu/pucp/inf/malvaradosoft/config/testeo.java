/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.config;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Grade;

/**
 *
 * @author alulab14
 */
public class testeo {
    public static void main(String[] args){
        Course course = new Course ();
        course.setId(1);
        //ArrayList<Grade> grades = DBController.queryGradesByCourseId(course);
        //for (Grade grade : grades) {
        //    System.out.println("Grade description: " + grade.getDescription());
            
        //}
        Grade grade = new Grade();
        grade.getCourse().setId(course.getId());
        grade.setDescription("Extr1");
        grade.setWeight((Double)(0.69));
        
        int r = DBController.insertGrade(grade);
        System.out.println("Resultado: " + r);
    }
    
}
