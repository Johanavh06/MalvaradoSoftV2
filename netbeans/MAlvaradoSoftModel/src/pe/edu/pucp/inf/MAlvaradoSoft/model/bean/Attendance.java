/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.util.Date;

/**
 *
 * @author WIN10
 */
public class Attendance {
    private int idAttendance;
    private Date dateTime;

    public Attendance(int idAttendance, Date dateTime) {
        this.idAttendance = idAttendance;
        this.dateTime = dateTime;
    }

    public Attendance() {
    }

    public int getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(int idAttendance) {
        this.idAttendance = idAttendance;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
