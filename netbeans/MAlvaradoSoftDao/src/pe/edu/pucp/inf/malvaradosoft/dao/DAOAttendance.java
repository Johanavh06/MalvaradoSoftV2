/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Attendance;

/**
 *
 * @author WIN10
 */
public interface DAOAttendance {
    ArrayList <Attendance> queryAllAttendance();
    int insertAttendance(Attendance attendance);
    int updateAttendance(Attendance attendance);
    int deleteAttendance(int id);
}
