/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.User;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;

/**
 *
 * @author alulab14
 */
public interface DAOUserTypeXUser {
    ArrayList<UserType> queryAllTypesXUser(User user);
    int insertUserTypeXUser(User user,UserType userType);
    int deleteUserTypeXUser(User user,UserType userType);
    int updateUserTypeXUser(User user,UserType userType);
}
