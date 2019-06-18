/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOUserTypeXUser;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;


/**
 *
 * @author alulab14
 */
public class MySQLUserTypeXUser implements DAOUserTypeXUser{

    @Override
    public ArrayList<UserType> queryAllTypesXUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertUserTypeXUser(User user, UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteUserTypeXUser(User user, UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUserTypeXUser(User user, UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
