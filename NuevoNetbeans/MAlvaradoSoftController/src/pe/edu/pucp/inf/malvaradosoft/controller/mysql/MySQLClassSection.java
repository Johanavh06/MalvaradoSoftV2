/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mysql;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOClassSection;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;

/**
 *
 * @author alulab14
 */
public class MySQLClassSection implements DAOClassSection{

    @Override
    public ArrayList<ClassSection> queryAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClassSection> queryByLevel(int level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(ClassSection classSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(ClassSection classSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int idclassSection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
