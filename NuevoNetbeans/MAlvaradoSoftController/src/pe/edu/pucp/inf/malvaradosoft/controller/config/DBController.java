/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import java.time.Year;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Student;
import pe.edu.pucp.inf.malvaradosoft.model.bean.StudentXYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;

public abstract class DBController {
    private static DAOFactory daoFactory = 
            DAOFactory.getDAOFactory();
    
    public static ArrayList<User> queryAllUsers(){
        return daoFactory.getUserDAO().queryAllUsers();
    }
    
    public static ArrayList<User> queryAllUsersByUserType(UserType userType){
        return daoFactory.getUserDAO().queryAllUsersByUserType(userType);
    }
    
    public static User queryAllUsersByDNI(String dni){
        return daoFactory.getUserDAO().queryAllUsersByDNI(dni);
    }
    
    public static ArrayList<User> queryAllUsersByName(String name){
        return daoFactory.getUserDAO().queryAllUsersByName(name);
    }
    
    public static ArrayList<User> queryAllUsersByFirstLastName(String firstLastName){
        return daoFactory.getUserDAO().queryAllUsersByFirstLastName(firstLastName);
    }
    
    public static ArrayList<User> queryAllUsersBySecondLastName(String secondLastName){
        return daoFactory.getUserDAO().queryAllUsersBySecondLastName(secondLastName);
    }
    
    public static ArrayList<User> queryAllUsersBlocked(){
        return daoFactory.getUserDAO().queryAllUsersBlocked();
    }
    
    public static int InsertUser(User user){
        return daoFactory.getUserDAO().InsertUser(user);
    }
    
    public static int updateUser(User user){
        return daoFactory.getUserDAO().updateUser(user);
    }
    
    public static int deleteUser(User user){
        return daoFactory.getUserDAO().deleteUser(user);
    }
    
    public static ArrayList<UserType> queryAllUserTypes(){
        return daoFactory.getUserTypeDAO().queryAllUserTypes();
    }
    
    public static int InsertUserType(UserType userType){
        return daoFactory.getUserTypeDAO().InsertUserType(userType);
    }
    
    public static int updateUserType(UserType userType){
        return daoFactory.getUserTypeDAO().updateUserType(userType);
    }
    
    public static int deleteUserType(UserType userType){
        return daoFactory.getUserTypeDAO().deleteUserType(userType);
    }
    
    public static ArrayList<Student> queryAllStudents(){
        return daoFactory.getStudentDAO().queryAllStudents();
    }
    
    public static ArrayList<Student> queryAllUsersByGuardian(User guardian){
        return daoFactory.getStudentDAO().queryAllUsersByGuardian(guardian);
    }
    
    public static int InsertStudent(Student student){
        return daoFactory.getStudentDAO().InsertStudent(student);
    }
    
    public static int updateStudent(Student student){
        return daoFactory.getStudentDAO().updateStudent(student);
    }
    
    public static int deleteStudent(Student student){
        return daoFactory.getStudentDAO().deleteStudent(student);
    }
    
    public static ArrayList<StudentXYear> queryAllStudentXYear(){
        return daoFactory.getStudentXYearDAO().queryAllStudentXYear();
    }
    
    public static ArrayList<StudentXYear> queryAllStudentXYearByCondition(Condition condition){
        return daoFactory.getStudentXYearDAO().queryAllStudentXYearByCondition(condition);
    }
    
    public static ArrayList<StudentXYear> queryAllStudentXYearByYear(Year year){
        return daoFactory.getStudentXYearDAO().queryAllStudentXYearByYear(year);
    }
    
    public static ArrayList<StudentXYear> queryAllUsersByClassSection(ClassSection clasSection){
        return daoFactory.getStudentXYearDAO().queryAllUsersByClassSection(clasSection);
    }
    
    public static ArrayList<StudentXYear> queryAllUsersByNotEmptyTicketEnrollment(){
        return daoFactory.getStudentXYearDAO().queryAllUsersByNotEmptyTicketEnrollment();
    }
    
    public int InsertStudentXYear(StudentXYear studentXYear){
        return daoFactory.getStudentXYearDAO().InsertStudentXYear(studentXYear);
    }
    
    public int updateStudentXYear(StudentXYear studentXYear){
        return daoFactory.getStudentXYearDAO().updateStudentXYear(studentXYear);
    }
    
    public int deleteStudentXYear(StudentXYear studentXYear){
        return daoFactory.getStudentXYearDAO().deleteStudentXYear(studentXYear);
    }
    
    
}        
