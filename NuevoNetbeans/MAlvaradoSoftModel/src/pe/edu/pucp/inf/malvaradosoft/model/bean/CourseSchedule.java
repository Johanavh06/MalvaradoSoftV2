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
public class CourseSchedule implements Serializable{
    private int id;
    private Classroom classroom;
    private Course course;
    private ClassSection classSection;
    private TeacherXYear teacherXyear;

    public CourseSchedule() {
    }

    public CourseSchedule(int id, Classroom classroom, Course course, ClassSection classSection, TeacherXYear teacherXyear) {
        this.id = id;
        this.classroom = classroom;
        this.course = course;
        this.classSection = classSection;
        this.teacherXyear = teacherXyear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ClassSection getClassSection() {
        return classSection;
    }

    public void setClassSection(ClassSection classSection) {
        this.classSection = classSection;
    }

    public TeacherXYear getTeacherXyear() {
        return teacherXyear;
    }

    public void setTeacherXyear(TeacherXYear teacherXyear) {
        this.teacherXyear = teacherXyear;
    }
    
}
