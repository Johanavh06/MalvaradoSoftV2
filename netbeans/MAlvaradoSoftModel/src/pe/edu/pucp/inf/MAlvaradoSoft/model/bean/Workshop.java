/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

/**
 *
 * @author alulab14
 */
public class Workshop {
    private int idWorkshop;
    private Course course;
    private Teacher teacher;
    private Schedule schedule;
    private String description;

    public Workshop(int idWorkshop, Course course, Teacher teacher, Schedule schedule,String description) {
        super();
        this.idWorkshop = idWorkshop;
        this.course = course;
        this.teacher = teacher;
        this.schedule = schedule;
        this.description = description;
    }
    
    public Workshop(){
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
