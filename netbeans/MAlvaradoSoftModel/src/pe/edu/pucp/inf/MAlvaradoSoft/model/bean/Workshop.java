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
public class Workshop {
    private int idWorkshop;
    private Course course;
    private Teacher teacher;
    private Schedule schedule;
    private ArrayList<Student> students;
    private String description;
    private int tableStatus;

    public Workshop(int idWorkshop, Course course, Teacher teacher, Schedule schedule, ArrayList<Student> students, String description) {
        super();
        this.idWorkshop = idWorkshop;
        this.course = course;
        this.teacher = teacher;
        this.schedule = schedule;
        this.students = students;
        this.description = description;
        this.tableStatus = 1;
    }
    
    public Workshop(){
        this.tableStatus = 1;
    }

    public int getIdWorkshop() {
        return idWorkshop;
    }

    public void setIdWorkshop(int idWorkshop) {
        this.idWorkshop = idWorkshop;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
}
