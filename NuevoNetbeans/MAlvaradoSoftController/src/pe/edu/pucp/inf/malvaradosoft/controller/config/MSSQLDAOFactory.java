/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOBimesterXStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassSection;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassroom;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourse;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourseSchedule;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOGrade;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUser;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserType;

import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserTypeXUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLBimesterXStudentXYear;

import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLClassSection;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLClassroom;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLCourse;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLCourseSchedule;

import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLUserType;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLUserTypeXUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLUserTypeXUser;

public class MSSQLDAOFactory extends DAOFactory{
    public MSSQLDAOFactory(){
        
    }
    
    public DAOStudent getStudentDAO(){
        return new MSSQLStudent();
    }
    
    public DAOUser getUserDAO(){
        return new MSSQLUser();
    }
    
    public DAOUserType getUserTypeDAO(){
        return new MSSQLUserType();
    }

    @Override
    public DAOStudentXYear getStudentXYearDAO() {
        return new MSSQLStudentXYear();
    }

    public DAOUserTypeXUser getUserTypeXUserDAO(){
        return new MSSQLUserTypeXUser();
    }

    @Override
    public DAOCourse getCourseDAO() {
        return new MSSQLCourse();
    }

    @Override
    public DAOCourseSchedule getCourseScheduleDAO() {
        return new MSSQLCourseSchedule();
    }

    @Override
    public DAOClassSection getClassSectionDAO() {
        return new MSSQLClassSection();
    }

    @Override
    public DAOClassroom getClassroomDAO() {
        return new MSSQLClassroom();

    }

    @Override
    public DAOGrade getGradeDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOBimesterXStudentXYear getBimesterXStudentXYearDAO() {
        return new MSSQLBimesterXStudentXYear();
    }
}

