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
public class StudentXAttendance implements Serializable{
    
    private Attendance attendance;
    private String observation;
    private Year_ year;
    private Student student;

    public StudentXAttendance() {
        attendance = new Attendance();
        year = new Year_();
        student = new Student();
    }
    
    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
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
