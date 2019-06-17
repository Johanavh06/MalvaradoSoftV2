/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public interface DAOStudent {
    ArrayList<Student> queryAllStudents();
    ArrayList<Student> queryAllUsersByGuardian(User guardian);
    int InsertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(Student student);
}
