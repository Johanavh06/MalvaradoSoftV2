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
public class ClassSection {
    private int idClassSection;
    private int total;
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private int tableStatus;
    
    public ClassSection() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.tableStatus = 1;
    }

    public ClassSection(int total, int id, ArrayList<Student> students, ArrayList<Course> courses, String name) {
        this.total = total;
        this.idClassSection = id;
        this.students = students;
        this.courses = courses;
        this.name = name;
        this.tableStatus = 1;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdClassSection() {
        return idClassSection;
    }

    public void setIdClassSection(int idClassSection) {
        this.idClassSection = idClassSection;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
    
}
