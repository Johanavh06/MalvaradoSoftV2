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
public class Bimester implements Serializable {
    private int idBimester;
    private int valorBimester;

    public Bimester() {
    }

    public Bimester(int idBimester, int valorBimester) {
        this.idBimester = idBimester;
        this.valorBimester = valorBimester;
    }

    public int getIdBimester() {
        return idBimester;
    }

    public void setIdBimester(int idBimester) {
        this.idBimester = idBimester;
    }

    public int getValorBimester() {
        return valorBimester;
    }

    public void setValorBimester(int valorBimester) {
        this.valorBimester = valorBimester;
    }
    
}
