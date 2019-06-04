/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.config;

import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Grade;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Guardian;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Principal;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.StudentXWorkshop;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Teacher;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.User;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Workshop;


/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public abstract class DBController {
    private static DAOFactory daoFactory = DAOFactory.getDAOFactory();
    
    public static int insertTeacher(Teacher teacher){
        return daoFactory.getTeacherDAO().insertTeacher(teacher);
    }
    public static int updateTeacher(Teacher teacher){
        return daoFactory.getTeacherDAO().updateTeacher(teacher);
    }
    public static int deleteTeacher(int id){
        return daoFactory.getTeacherDAO().deleteTeacher(id);
    }
    public static ArrayList<Teacher> queryAllTeacher(){
        return daoFactory.getTeacherDAO().queryAll();
    }
    public static int insertUser(User user){
        return daoFactory.getUserDAO().insertUser(user);
    }
    public static int updateUser(User user){
        return daoFactory.getUserDAO().updateUser(user);
    }
    public static int deleteUser(int id){
        return daoFactory.getUserDAO().deleteUser(id);
    }
    public static ArrayList<User> queryAllUser(){
        return daoFactory.getUserDAO().queryAll();
    }
    public static int insertWorkshop(Workshop workshop){
        return daoFactory.getWorkshopDAO().insertWorkshop(workshop);
    }
    public static int updateWorkshop(Workshop workshop){
        return daoFactory.getWorkshopDAO().updateWorkshop(workshop);
    }
    public static int deleteWorkshop(int id){
        return daoFactory.getWorkshopDAO().deleteWorkshop(id);
    }
    public static ArrayList<Workshop> queryAllWorkshop(){
        return daoFactory.getWorkshopDAO().queryAll();
    }
    public static int insertStudentXWorkshop(StudentXWorkshop studentXWorkshop){
        return daoFactory.getStudentXWorkshopDAO().insertStudentXWorkshop(studentXWorkshop);
    }
    public static int updateStudentXWorkshop(StudentXWorkshop studentXWorkshop){
        return daoFactory.getStudentXWorkshopDAO().updateStudentXWorkshop(studentXWorkshop);
    }
    public static int deleteStudentXWorkshop(int idStudent, int idWorkshop){
        return daoFactory.getStudentXWorkshopDAO().deleteStudentXWorkshop(idStudent,idWorkshop);
    }
    public static ArrayList<StudentXWorkshop> queryAllStudentXWorkshop(){
        return daoFactory.getStudentXWorkshopDAO().queryAll();
    }  
    public static ArrayList<Grade> queryAllGrade(){
        return daoFactory.getGradeDAO().queryAll();
    }
    public static int updateGrade(Grade grade){
        return daoFactory.getGradeDAO().update(grade);
    }
    public static int deleteGrade(int id){
        return daoFactory.getGradeDAO().delete(id);
    }
    public static ArrayList<Guardian> queryAllGuardian(){
        return daoFactory.getGuardianDAO().queryAll();
    }
    public static int updateGuardian(Guardian guardian){
        return daoFactory.getGuardianDAO().update(guardian);
    }
    public static int deleteGuardian(int id){
        return daoFactory.getGuardianDAO().delete(id);
    }
    public static ArrayList<Principal> queryAllPrincipal(){
        return daoFactory.getPrincipalDAO().queryAll();
    }
    public static int updatePrincipal(Principal principal){
        return daoFactory.getPrincipalDAO().update(principal);
    }
    public static int deletePrincipal(int id){
        return daoFactory.getPrincipalDAO().delete(id);
    }
}

