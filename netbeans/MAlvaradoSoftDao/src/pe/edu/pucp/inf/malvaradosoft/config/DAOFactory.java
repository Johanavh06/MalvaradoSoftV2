/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.config;

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
        if(DBManager.getdbManager().getUrl().contains("mysql")){
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
    
    
}
