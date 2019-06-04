/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.StudentXWorkshop;

/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public interface DAOStudentXWorkshop {
    ArrayList <StudentXWorkshop > queryAll();
    int insertStudentXWorkshop(StudentXWorkshop workshop);
    int updateStudentXWorkshop(StudentXWorkshop workshop);
    int deleteStudentXWorkshop(int idStudent, int idWorkshop);    
}
