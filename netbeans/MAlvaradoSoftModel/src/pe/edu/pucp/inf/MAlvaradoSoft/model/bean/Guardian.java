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
public class Guardian extends User{
    private ArrayList<Student> students;

    public Guardian() {
        students = new ArrayList<>();
    }

    public Guardian(ArrayList<Student> students, int idUser, String names, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, String userName, String password) {
        super(idUser, names, firstLastName, secondLastName, dni, adress, phone, email, userName, password);
        this.students = students;
    }
    
    public Guardian(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
       
}
