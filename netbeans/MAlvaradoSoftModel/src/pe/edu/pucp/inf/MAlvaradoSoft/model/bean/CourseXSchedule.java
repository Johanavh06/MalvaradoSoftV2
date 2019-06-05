/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class CourseXSchedule {
    // el primary key de esta clase esta compuesto por el idCourse y idSchedule
    private ClassSection classSection;
    private Schedule schedule;
    private Teacher teacher;
    private Course course;
    private ArrayList<Grade> grades;    

    public CourseXSchedule() {
        classSection = new ClassSection();
        schedule = new Schedule();
        teacher = new Teacher();
        course = new Course();
        grades = new ArrayList<>();
        
    }

    public ClassSection getClassSection() {
        return classSection;
    }

    public void setClassSection(ClassSection classSection) {
        this.classSection = classSection;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }   
    
}
