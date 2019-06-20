/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class UserType implements Serializable {
    private int idUserType;
    private String description;

    public UserType() {
    }

    public UserType(int idUserType, String description) {
        this.idUserType = idUserType;
        this.description = description;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
