/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.util.ArrayList;

/**
 *
 * @author WIN10
 */
public class StudentXWorkshop {
    private Student student;
    private Workshop workshop;
    private int id;
    private int tableStatus;
    
    public StudentXWorkshop(){
        tableStatus = 1;
    }
    public StudentXWorkshop(int id, Student student, Workshop workshop) {
        super();
        this.student = student;
        this.workshop = workshop;
        this.id = id;
        this.tableStatus = 1;
    }    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
    
    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}
