/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassSection;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassroom;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourse;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCourseSchedule;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUser;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserType;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserTypeXUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLClassSection;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLClassroom;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLCourse;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLCourseSchedule;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLUserType;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLUserTypeXUser;

public class MySQLDAOFactory extends DAOFactory{
    
    public MySQLDAOFactory(){
        
    }
    
    public DAOStudent getStudentDAO(){
        return new MySQLStudent();
    }
    
    public DAOUser getUserDAO(){
        return new MySQLUser();
    }

    public DAOUserType getUserTypeDAO() {
        return new MySQLUserType();
    }

    public DAOStudentXYear getStudentXYearDAO() {
        return new MySQLStudentXYear();
    }


    public DAOUserTypeXUser getUserTypeXUserDAO() {
        return new MySQLUserTypeXUser();
    }

    @Override
    public DAOCourse getCourseDAO() {
        return new MySQLCourse();
    }

    @Override
    public DAOCourseSchedule getCourseScheduleDAO() {
        return new MySQLCourseSchedule();
    }

    @Override
    public DAOClassSection getClassSectionDAO() {
        return new MySQLClassSection();
    }

    @Override
    public DAOClassroom getClassroomDAO() {
        return new MySQLClassroom();
    }
    

    
}
