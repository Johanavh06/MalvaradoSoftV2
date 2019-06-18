/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.mssql;

import java.time.Year;
import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.controller.dao.DAOYear;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Year_;

/**
 *
 * @author alulab14
 */
public class MSSQLYear implements DAOYear {

    @Override
    public int insertYear(Year_ y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Year_> queryAllYears() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteYear(int idYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
