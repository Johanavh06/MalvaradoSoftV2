/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public interface DAOYear {
    int insertYear(Year_ y);
    ArrayList<Year> queryAllYears();
    int deleteYear(int idYear);
}
