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
public class BimesterXStudentXYear {
    private Bimester bimester;
    private Year year;
    private Student student;

    public BimesterXStudentXYear() {
    }

    public BimesterXStudentXYear(Bimester bimester, Year year, Student student) {
        this.bimester = bimester;
        this.year = year;
        this.student = student;
    }

    public Bimester getBimester() {
        return bimester;
    }

    public void setBimester(Bimester bimester) {
        this.bimester = bimester;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
            
}
