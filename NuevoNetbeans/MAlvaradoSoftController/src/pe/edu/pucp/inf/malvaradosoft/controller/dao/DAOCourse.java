/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;

/**
 *
 * @author Renato
 */
public interface DAOCourse {
    ArrayList <Course> queryAll();
    ArrayList <Course> queryAllCourseByLevel(int level);
    int insert(Course course);
    int update(Course course);
    int delete(int id);
    
}
