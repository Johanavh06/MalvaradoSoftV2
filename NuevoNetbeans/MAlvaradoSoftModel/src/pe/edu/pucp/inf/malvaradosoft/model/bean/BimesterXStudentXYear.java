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
public class BimesterXStudentXYear implements Serializable{
    private Bimester bimester;
    private Year_ year;
    private Student student;

    public BimesterXStudentXYear() {
    }

    public BimesterXStudentXYear(Bimester bimester, Year_ year, Student student) {
        this.bimester = bimester;
        this.year = year;
        this.student = student;
    }

    public Bimester getBimester() {
        return bimester;
    }

    public void setBimester(Bimester bimester) {
        this.bimester = bimester;
    }

    public Year_ getYear() {
        return year;
    }

    public void setYear(Year_ year) {
        this.year = year;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
            
}
