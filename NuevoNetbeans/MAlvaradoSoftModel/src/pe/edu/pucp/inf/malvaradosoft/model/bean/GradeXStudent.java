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
public class GradeXStudent implements Serializable{
    private double value;
    private Date registerDate;
    private Bimester bimester; //idBimester
    private Year_ year; //idYear
    private Student student; //idStudent
    private Grade grade; // idGrade
    private Course course ; // idCourse

    public GradeXStudent() {
    }
    
    
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
    
}
