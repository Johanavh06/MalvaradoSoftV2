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
public class User {

    private int idUser;
    private String names;
    private String firstLastName;
    private String secondLastName;
    private String dni;
    private String adress;
    private int phone;
    private String email;
    private String userName;
    private String password;
    
    public User(){
    }
    public User(int idUser, String names, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, String userName, String password) {
        this.idUser = idUser;
        this.names = names;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.dni = dni;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
