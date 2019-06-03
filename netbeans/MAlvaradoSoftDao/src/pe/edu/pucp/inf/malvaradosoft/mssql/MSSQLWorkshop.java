/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.mssql;

import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Workshop;
import pe.edu.pucp.inf.malvaradosoft.dao.DAOWorkshop;

/**
 *
 * @author Sebastian Sanchez Herrera 20143071
 */
public class MSSQLWorkshop implements DAOWorkshop{

    @Override
    public ArrayList<Workshop> queryAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Workshop workshop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Workshop workshop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
