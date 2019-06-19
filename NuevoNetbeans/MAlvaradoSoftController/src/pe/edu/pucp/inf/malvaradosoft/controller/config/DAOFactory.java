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

public abstract class DAOFactory {
    
    public static DAOFactory getDAOFactory(){
        if(DBManager.getDbManager().getUrl().contains("mysql")){
                return new MySQLDAOFactory();
        }
        else{
                return new MSSQLDAOFactory();
        }
            
    }
    
    public abstract DAOStudent getStudentDAO();
    public abstract DAOUser getUserDAO();
    public abstract DAOUserType getUserTypeDAO();
    public abstract DAOUserTypeXUser getUserTypeXUserDAO();
    public abstract DAOStudentXYear getStudentXYearDAO();
    public abstract DAOCourse getCourseDAO();
    public abstract DAOCourseSchedule getCourseScheduleDAO();
    public abstract DAOClassSection getClassSectionDAO();
    public abstract DAOClassroom getClassroomDAO();
    public abstract DAOGrade getGradeDAO();
    public abstract DAOBimesterXStudentXYear getBimesterXStudentXYearDAO();
}
