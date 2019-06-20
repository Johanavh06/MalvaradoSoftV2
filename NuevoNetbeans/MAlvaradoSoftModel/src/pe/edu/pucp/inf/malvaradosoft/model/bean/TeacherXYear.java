/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class TeacherXYear implements Serializable {
    private int idTeacherXYear;
    private Year_ year;

    public TeacherXYear() {
        this.year = new Year_ ();
    }

    public TeacherXYear(int idTeacherXYear, Year_ year) {
        this.idTeacherXYear = idTeacherXYear;
        this.year = year;
    }

    public int getIdTeacherXYear() {
        return idTeacherXYear;
    }

    public void setIdTeacherXYear(int idTeacherXYear) {
        this.idTeacherXYear = idTeacherXYear;
    }

    public Year_ getYear() {
        return year;
    }

    public void setYear(Year_ year) {
        this.year = year;
    }
    
}
