/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;

public abstract class DAOFactory {
    
    public static DAOFactory getDAOFactory(){
        if(DBManager.getDbManager().getUrl().contains("mysql")){
                return new MySQLDAOFactory();
        }
        else{
                return new MSSQLDAOFactory();
        }
            
    }
    
    //public abstract DAOStudent getStudentDAO();
    
}
