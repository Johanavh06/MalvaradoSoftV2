/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.UserType;

/**
 *
 * @author Johana Vergara Hernández 20135184
 */
public interface DAOUserType {
    ArrayList<UserType> queryAllUserTypes();
    int InsertUserType(UserType userType);
    int updateUserType(UserType userType);
    int deleteUserType(UserType userType);
}
