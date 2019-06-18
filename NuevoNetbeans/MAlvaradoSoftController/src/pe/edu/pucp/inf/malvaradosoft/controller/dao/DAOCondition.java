/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;


/**
 *
 * @author alulab14
 */
public interface DAOCondition {
    int insertCondition(Condition c);
    ArrayList<Condition> queryAllCondition ();
    Condition getCondition(int id);
    int deleteCondition (int id);
}
