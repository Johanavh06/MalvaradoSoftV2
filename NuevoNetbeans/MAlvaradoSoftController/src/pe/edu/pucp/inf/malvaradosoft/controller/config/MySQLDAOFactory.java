/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOStudent;
import pe.edu.pucp.inf.malvaradosoft.controller.mysql.MySQLStudent;

public class MySQLDAOFactory extends DAOFactory{
    
    public MySQLDAOFactory(){
        
    }
    
    public DAOStudent getStudentDAO(){
        return new MySQLStudent();
    }
    
    
}
