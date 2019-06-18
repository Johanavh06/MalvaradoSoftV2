/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import java.time.Year;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Classroom;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.CourseSchedule;
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

    public static ArrayList<Course> queryAllCourse(){
        return daoFactory.getCourseDAO().queryAll();
    }
    public static ArrayList<Course> queryAllCourseByLevel(int level){
        return daoFactory.getCourseDAO().queryAllCourseByLevel(level);
    }
    public static int insertCourse(Course course){
        return daoFactory.getCourseDAO().insert(course);
    }
    public static int updateCourse(Course course){
        return daoFactory.getCourseDAO().update(course);
    }
    public static int deleteCourse(int id){
        return daoFactory.getCourseDAO().delete(id);
    }
    
    public static ArrayList<CourseSchedule> queryAllCourseSchedule(){
        return daoFactory.getCourseScheduleDAO().queryAll();
    }
    public static ArrayList<CourseSchedule> queryAllCourseById(int idCourse, int idClassSection){
        return daoFactory.getCourseScheduleDAO().queryById(idCourse, idClassSection);
    }
    public static int insertCourseSchedule(CourseSchedule courseSchedule){
        return daoFactory.getCourseScheduleDAO().insert(courseSchedule);
    }
    public static int updateCourseSchedule(CourseSchedule courseSchedule){
        return daoFactory.getCourseScheduleDAO().update(courseSchedule);
    }
    public static int deleteCourseSchedule(int id){
        return daoFactory.getCourseScheduleDAO().delete(id);
    }
    
    public static ArrayList<ClassSection> queryAllClassSection(){
        return daoFactory.getClassSectionDAO().queryAll();
    }
    public static ArrayList<ClassSection> queryAllCourseById(int level){
        return daoFactory.getClassSectionDAO().queryByLevel(level);
    }
    public static int insertClassSection(ClassSection classSection){
        return daoFactory.getClassSectionDAO().insert(classSection);
    }
    public static int updateClassSection(ClassSection classSection){
        return daoFactory.getClassSectionDAO().update(classSection);
    }
    public static int deleteClassSection(int id){
        return daoFactory.getClassSectionDAO().delete(id);
    }
    
    public static ArrayList<Classroom> queryAllCourseById(){
        return daoFactory.getClassroomDAO().queryAll();
    }
    public static int insertClassroom(Classroom classroom){
        return daoFactory.getClassroomDAO().insert(classroom);
    }
    public static int updateClassroom(Classroom classroom){
        return daoFactory.getClassroomDAO().update(classroom);
    }
    public static int deleteClassroom(int id){
        return daoFactory.getClassroomDAO().delete(id);
    }
}        
