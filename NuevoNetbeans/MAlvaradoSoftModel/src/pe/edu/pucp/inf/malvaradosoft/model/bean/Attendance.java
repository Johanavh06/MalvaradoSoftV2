/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Attendance implements Serializable {
    private int idAttendance;
    private Date date;

    public Attendance() {
        date = new Date();
    }
    
    
    
    public int getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(int idAttendance) {
        this.idAttendance = idAttendance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
