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
 * @author Johana Vergara Hernández 20135184
 */
public interface DAOUser {
    ArrayList<User> queryAllUsers();
    ArrayList<User> queryAllUsersByUserType(UserType userType);
    User queryAllUsersByDNI(String dni);
    ArrayList<User> queryAllUsersByName(String name);
    ArrayList<User> queryAllUsersByFirstLastName(String firstLastName);
    ArrayList<User> queryAllUsersBySecondLastName(String secondLastName);
    ArrayList<User> queryAllUsersBlocked();
    int InsertUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
    User queryUserLogin(String name, String password);
}
