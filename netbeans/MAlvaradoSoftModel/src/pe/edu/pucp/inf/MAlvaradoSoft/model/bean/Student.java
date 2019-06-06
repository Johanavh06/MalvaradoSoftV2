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
public class Student extends User {
    private String section;
    private String condition;
    private Guardian guardian;
    private ClassSection classSection;
    private String ticketNumerEnrollment;

    public Student() {
    }

    public Student(String section, String condition, Guardian guardian, ClassSection classSection, String ticketNumerEnrollment, int idUser, String names, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, String userName, String password) {
        super(idUser, names, firstLastName, secondLastName, dni, adress, phone, email, userName, password);
        this.section = section;
        this.condition = condition;
        this.guardian = guardian;
        this.classSection = classSection;
        this.ticketNumerEnrollment = ticketNumerEnrollment;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public ClassSection getClassSection() {
        return classSection;
    }

    public void setClassSection(ClassSection classSection) {
        this.classSection = classSection;
    }

    public String getTicketNumerEnrollment() {
        return ticketNumerEnrollment;
    }

    public void setTicketNumerEnrollment(String ticketNumerEnrollment) {
        this.ticketNumerEnrollment = ticketNumerEnrollment;
    }
 
}
