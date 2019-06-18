/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mssql;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOCondition;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Condition;

/**
 *
 * @author alulab14
 */
public class MSSQLCondition implements DAOCondition{

    @Override
    public int insertCondition(Condition c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Condition> queryAllCondition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condition getCondition(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteCondition(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
