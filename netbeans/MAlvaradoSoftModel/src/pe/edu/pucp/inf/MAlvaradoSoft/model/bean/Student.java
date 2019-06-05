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
    private Guardian guardian;
    private int condition;
    private ClassSection classSection;
    //private int _class;

    public Student() {
        
    }

    public Student(Guardian guardian, int condition, ClassSection classSection, int idUser, String names, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, String userName, String password) {
        super(idUser, names, firstLastName, secondLastName, dni, adress, phone, email, userName, password);
        this.guardian = guardian;
        this.condition = condition;
        this.classSection = classSection;
    }
    
  
}
