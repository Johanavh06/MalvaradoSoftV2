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
    private ArrayList<CourseXSchedule> courses;
    
    public ClassSection() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public ClassSection(int total, int id, ArrayList<Student> students, ArrayList<CourseXSchedule> courses, String name) {
        this.total = total;
        this.idClassSection = id;
        this.students = students;
        this.courses = courses;
        this.name = name;
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

    public int addStudents(Student student) {
        students.add(student);
        return student.getIdStudent();
    }

    public ArrayList<CourseXSchedule> getCourses() {
        return courses;
    }

    public int addCourses(CourseXSchedule c) {
        courses.add(c);
        return c.getIdCourseSchedule();
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

}
