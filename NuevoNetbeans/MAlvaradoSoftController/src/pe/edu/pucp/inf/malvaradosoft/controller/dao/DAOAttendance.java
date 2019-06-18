/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Attendance;

/**
 *
 * @author alulab14
 */
public interface DAOAttendance {
    ArrayList <Attendance> queryAll();
    int insert(Attendance attendance);
    int update(Attendance attendance);
    int delete(int id);
}
