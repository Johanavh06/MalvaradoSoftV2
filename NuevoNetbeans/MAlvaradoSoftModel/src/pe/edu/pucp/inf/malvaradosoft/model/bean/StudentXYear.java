/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

/**
 *
 * @author lenovo
 */
public class StudentXYear {
    private Student student;
    private Condition condition;
    private String ticketEnrollment;
    private ClassSection classSection;
    private Year_ year;

    public StudentXYear() {
    }

    public StudentXYear(Student student, Condition condition, String ticketEnrollment, ClassSection classSection, Year_ year) {
        this.student = student;
        this.condition = condition;
        this.ticketEnrollment = ticketEnrollment;
        this.classSection = classSection;
        this.year = year;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getTicketEnrollment() {
        return ticketEnrollment;
    }

    public void setTicketEnrollment(String ticketEnrollment) {
        this.ticketEnrollment = ticketEnrollment;
    }

    public ClassSection getClassSection() {
        return classSection;
    }

    public void setClassSection(ClassSection classSection) {
        this.classSection = classSection;
    }

    public Year_ getYear() {
        return year;
    }

    public void setYear(Year_ year) {
        this.year = year;
    }
}
