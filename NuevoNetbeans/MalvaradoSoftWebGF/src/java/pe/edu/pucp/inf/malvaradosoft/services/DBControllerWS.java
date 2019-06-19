/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.services;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.pucp.inf.malvaradosoft.controller.config.DBController;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Course;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Grade;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;

/**
 *
 * @author alulab14
 */
@WebService(serviceName = "DBControllerWS")
public class DBControllerWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "queryAllGrades")
    public ArrayList<Grade> queryAllGrades(){
        return DBController.queryAllGrades();
    }
    
    @WebMethod(operationName = "queryGradesByCourseId")
    public ArrayList<Grade> queryAllGradesByCourse(int idCourse){
        Course course = new Course();
        course.setId(idCourse);
        return DBController.queryGradesByCourseId(course);
    }
    
    @WebMethod(operationName = "insertGRade")
    public int insertGrade(@WebParam(name = "grade") Grade grade) {
        return DBController.insertGrade(grade);
    }
    
    @WebMethod(operationName = "updateGRade")
    public int updateGrade(@WebParam(name = "grade") Grade grade) {
        return DBController.updateGrade(grade);
    }
    
    @WebMethod(operationName = "deleteGRade")
    public int deleteGrade(@WebParam(name = "grade") Grade grade) {
        return DBController.deleteGrade(grade);
    }
    
    @WebMethod(operationName = "updatePasswordUser")
    public int updatePasswordUser (@WebParam(name = "email") String email,
                                    @WebParam(name = "password") String password) {
        return DBController.updatePasswordUser(email, password);
    }
    
    @WebMethod(operationName = "getNAttemptsByUserName")
    public int getNAttemptsByUserName(@WebParam(name = "username")String username){
        return DBController.getNAttemptsByUserName(username);
    }
    @WebMethod(operationName = "queryUserLogin")
    public User queryUserLogin(@WebParam(name = "username")String username, @WebParam(name = "password") String password){
        return DBController.queryUserLogin(username, password);
    }
}
