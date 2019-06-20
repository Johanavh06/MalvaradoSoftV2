/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Student extends User implements Serializable {
    private User guardian;
    private Object birthCertificate;
    private Object studyCertificate;

    public Student() {
    }

    public Student(int idUser, String names, String firstLastName, String SecondLastName, String dni, String address, int cellPhone, String email, String username, String password, boolean blocked, Time blockTime, int nAttemps, ArrayList<UserType> userTypes) {
        super(idUser, names, firstLastName, SecondLastName, dni, address, cellPhone, email, username, password, blocked, blockTime, nAttemps, userTypes);
    }
    
    public Student(User guardian, Object birthCertificate, Object studyCertificate) {
        this.guardian = guardian;
        this.birthCertificate = birthCertificate;
        this.studyCertificate = studyCertificate;
    }

    public Student(Object birthCertificate, Object studyCertificate, int idUser, String names, String firstLastName, String SecondLastName, String dni, String address, int cellPhone, String email, String username, String password, boolean blocked, Time blockTime, int nAttemps, ArrayList<UserType> userTypes) {
        super(idUser, names, firstLastName, SecondLastName, dni, address, cellPhone, email, username, password, blocked, blockTime, nAttemps, userTypes);
        this.birthCertificate = birthCertificate;
        this.studyCertificate = studyCertificate;
    }
    
    public User getGuardian() {
        return guardian;
    }

    public void setGuardian(User guardian) {
        this.guardian = guardian;
    }

    public Object getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(Object birthCertificate) {
        this.birthCertificate = birthCertificate;
    }

    public Object getStudyCertificate() {
        return studyCertificate;
    }

    public void setStudyCertificate(Object studyCertificate) {
        this.studyCertificate = studyCertificate;
    }
}
