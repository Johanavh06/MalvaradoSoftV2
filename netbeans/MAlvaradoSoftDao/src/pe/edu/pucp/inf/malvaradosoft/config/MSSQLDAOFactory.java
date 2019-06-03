/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.config;

import pe.edu.pucp.inf.malvaradosoft.dao.DAOAuxiliar;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOClassXSection;
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

/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public class MSSQLDAOFactory extends DAOFactory{    
    public MSSQLDAOFactory(){
        
    }

    @Override
    public DAOWorkshop getWorkshopDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOTeacher getTeacherDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOStudentXWorkshop getStudentXWorkshopDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOUser getUserDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOAuxiliar getAuxiliarDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOClassXSection getClassXSectionDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOClassroom getClassroomDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOCourse getCourseDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOCourseXSchedule getCourseXScheduleDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOExam getExamDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOGrade getGradeDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOGuardian getGuardianDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOPrincipal getPrincipalDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOSchedule getScheduleDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOSecretary getSecretaryDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAOStudent getStudentDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
