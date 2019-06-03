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

    public Workshop() {
    }

    public Workshop(int codWorkshop, int codCourse, int codTeacher, Schedule schedule, 
            ArrayList<Student> students, String description, int active, int idSchedule) {
        this.idWorkshop = codWorkshop;
        this.codCourse = codCourse;
        this.codTeacher = codTeacher;
        this.schedule = schedule;
        this.students = students;
        this.description = description;
        this.active=active;
        this.idSchedule=idSchedule;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }
    
    
    public int getActive() {
        return active;
    }
    
    public void setActive(int active) {
        this.active = active;
    }
    
    public int getIdWorkshop() {
        return idWorkshop;
    }

    public void setIdWorkshop(int idWorkshop) {
        this.idWorkshop = idWorkshop;
    }

    public int getCodCourse() {
        return codCourse;
    }

    public void setCodCourse(int codCourse) {
        this.codCourse = codCourse;
    }

    public int getCodTeacher() {
        return codTeacher;
    }

    public void setCodTeacher(int codTeacher) {
        this.codTeacher = codTeacher;
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
    
}
