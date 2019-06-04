/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

/**
 *
 * @author WIN10
 */
public class StudentXWorkshop {
    private Student student;
    private Workshop workshop;
    
    public StudentXWorkshop(){
        student = new Student();
        workshop = new Workshop();
    }
    public StudentXWorkshop(int id, Student student, Workshop workshop) {
        super();
        this.student = student;
        this.workshop = workshop;
    }    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }  
}
