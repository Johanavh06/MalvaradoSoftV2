/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.config;

import pe.edu.pucp.inf.malvaradosoft.dao.DAOAttendance;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOAuxiliar;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOClassroom;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOCourse;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOCourseXSchedule;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOExam;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOGrade;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOGuardian;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOPrincipal;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOSchedule;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOSecretary;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOStudentXWorkshop;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOTeacher;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOUser;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOWorkshop;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLAuxiliar;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLClassSection;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLClassroom;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLCourse;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLCoursexSchedule;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLExam;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLGrade;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLGuardian;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLPrincipal;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLSchedule;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLSecretary;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLStudent;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLStudentXWorkshop;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLTeacher;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLUser;
import pe.edu.pucp.inf.malvaradosoft.mysql.MySQLWorkshop;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOClassSection;

/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public class MySQLDAOFactory extends DAOFactory {
    public MySQLDAOFactory(){
        
    }

    @Override
    public DAOWorkshop getWorkshopDAO() {
        return new MySQLWorkshop();
    }

    @Override
    public DAOTeacher getTeacherDAO() {
        return new MySQLTeacher();
    }

    @Override
    public DAOStudentXWorkshop getStudentXWorkshopDAO() {
        return new MySQLStudentXWorkshop();
    }

    @Override
    public DAOUser getUserDAO() {
        return new MySQLUser();
    }

    @Override
    public DAOAuxiliar getAuxiliarDAO() {
        return new MySQLAuxiliar();
    }

    @Override
    public DAOClassSection getClassXSectionDAO() {
        return new MySQLClassSection();
    }

    @Override
    public DAOClassroom getClassroomDAO() {
        return new MySQLClassroom();
    }

    @Override
    public DAOCourse getCourseDAO() {
        return new MySQLCourse();
    }

    @Override
    public DAOCourseXSchedule getCourseXScheduleDAO() {
        return new MySQLCoursexSchedule();
    }

    @Override
    public DAOExam getExamDAO() {
        return new MySQLExam();
    }

    @Override
    public DAOGrade getGradeDAO() {
        return new MySQLGrade();
    }

    @Override
    public DAOGuardian getGuardianDAO() {
        return new MySQLGuardian();
    }

    @Override
    public DAOPrincipal getPrincipalDAO() {
        return new MySQLPrincipal();
    }

    @Override
    public DAOSchedule getScheduleDAO() {
        return new MySQLSchedule();
    }

    @Override
    public DAOSecretary getSecretaryDAO() {
        return new MySQLSecretary();
    }

    @Override
    public DAOStudent getStudentDAO() {
        return new MySQLStudent();
    }

    @Override
    public DAOAttendance getAttendanceDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOClassSection getClassSectionDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
