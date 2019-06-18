/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class User {
    private int idUser;
    private String names;
    private String firstLastName;
    private String SecondLastName;
    private String dni;
    private String address;
    private int cellPhone;
    private String email;
    private String username;
    private String password;
    private boolean blocked;
    private Time blockTime;
    private int nAttempts;
    private ArrayList<UserType> userTypes;


    public User() {
        this.userTypes = new ArrayList<>();
    }
   
    public User(int idUser, String names, String firstLastName, 
            String SecondLastName, String dni, String address, 
            int cellPhone, String email, String username,
            String password, boolean blocked, Time blockTime, 
            int nAttemps, ArrayList<UserType> userTypes) {
        this.idUser = idUser;
        this.names = names;
        this.firstLastName = firstLastName;
        this.SecondLastName = SecondLastName;
        this.dni = dni;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.blocked = blocked;
        this.blockTime = blockTime;
        this.nAttempts = nAttemps;
        this.userTypes = userTypes;
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
        return SecondLastName;
    }

    public void setSecondLastName(String SecondLastName) {
        this.SecondLastName = SecondLastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public Time getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Time blockTime) {
        this.blockTime = blockTime;
    }

    public void setUserTypes(UserType userType) {
        userTypes.add(userType);
    }

    public UserType getUserType(int pos) {
        return userTypes.get(pos);
    }
    
    public ArrayList<UserType> getArrayUserTypes() {
        return userTypes;
    }

    public int getnAttempts() {
        return nAttempts;
    }

    public void setnAttempts(int nAttempts) {
        this.nAttempts = nAttempts;
    }
    
}
