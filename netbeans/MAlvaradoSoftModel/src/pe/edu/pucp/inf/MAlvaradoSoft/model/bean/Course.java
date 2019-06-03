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
public class Course {
    private int idCourse;
    private String name;
    private int _class;
    private int tableStatus;


    public Course(int idCourse, String name, int _class) {
        this.idCourse = idCourse;
        this.name = name;
        this._class = _class;
        this.tableStatus = 1;
    }
    
    public Course() {
        tableStatus = 1;
    }
    
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int get_Class() {
        return _class;
    }

    public void setClass(int _class) {
        this._class = _class;
    }
    
    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
    
}
