/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

/**
 *
 * @author lenovo
 */
public class Year_ {
    private int idYear;
    private int year;

    public Year_() {
    }

    public Year_(int idYear, int year) {
        this.idYear = idYear;
        this.year = year;
    }

    public int getIdYear() {
        return idYear;
    }

    public void setIdYear(int idYear) {
        this.idYear = idYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
