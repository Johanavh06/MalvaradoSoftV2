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
public class ClassSection implements Serializable{
    private int id;
    private int total;
    private String name;
    private int level;
    private Object schedulePDF;

    public ClassSection() {
    }

    public ClassSection(int id, int total, String name, int level, Object schedulePDF) {
        this.id = id;
        this.total = total;
        this.name = name;
        this.level = level;
        this.schedulePDF = schedulePDF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Object getSchedulePDF() {
        return schedulePDF;
    }

    public void setSchedulePDF(Object schedulePDF) {
        this.schedulePDF = schedulePDF;
    }
    
}
