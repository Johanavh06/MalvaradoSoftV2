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
public class Principal extends User {
       
    public Principal() {
    }

    public Principal(int idUser, String names, String firstLastName, String secondLastName, String dni, String adress, int phone, String email, String userName, String password) {
        super(idUser, names, firstLastName, secondLastName, dni, adress, phone, email, userName, password);
    }
   
        
}
