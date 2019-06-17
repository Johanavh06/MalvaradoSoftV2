/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUser;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserType;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLStudentXYear;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLUser;
import pe.edu.pucp.inf.malvaradosoft.controller.mssql.MSSQLUserType;

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
}

