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
public abstract class DAOFactory {
    public static DAOFactory getDAOFactory(){
        if(DBManager.getDbManager().getUrl().contains("mysql")){
                return new MySQLDAOFactory();
        }
        else{
                return new MSSQLDAOFactory();
        }
            
    }
    
    public abstract DAOWorkshop getWorkshopDAO();
    public abstract DAOTeacher getTeacherDAO();
    public abstract DAOStudentXWorkshop getStudentXWorkshopDAO();
    public abstract DAOUser getUserDAO();
    public abstract DAOAuxiliar getAuxiliarDAO();
    public abstract DAOClassXSection getClassXSectionDAO();
    public abstract DAOClassroom getClassroomDAO();
    public abstract DAOCourse getCourseDAO();
    public abstract DAOCourseXSchedule getCourseXScheduleDAO();
    public abstract DAOExam getExamDAO();
    public abstract DAOGrade getGradeDAO();
    public abstract DAOGuardian getGuardianDAO();
    public abstract DAOPrincipal getPrincipalDAO();
    public abstract DAOSchedule getScheduleDAO();
    public abstract DAOSecretary getSecretaryDAO();
    public abstract DAOStudent getStudentDAO();
}
