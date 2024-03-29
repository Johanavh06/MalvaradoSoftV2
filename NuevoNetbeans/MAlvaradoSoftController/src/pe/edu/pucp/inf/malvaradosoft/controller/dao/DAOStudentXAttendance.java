/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXAttendance;

/**
 *
 * @author alulab14
 */
public interface DAOStudentXAttendance {
    ArrayList <StudentXAttendance> queryAllSXA();
    ArrayList <StudentXAttendance> queryAllSXAByStudent(Student student);
    ArrayList <StudentXAttendance> queryAllSXAByStudentObservation(Student student, String observation);
    int insert(StudentXAttendance studentXAttendance);
    int update(StudentXAttendance studentXAttendance);
    int delete(int idAttendance, int idStudent);
}
