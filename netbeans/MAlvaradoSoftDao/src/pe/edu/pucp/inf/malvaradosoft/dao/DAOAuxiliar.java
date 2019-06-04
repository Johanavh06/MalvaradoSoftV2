/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.MAlvaradoSoft.model.bean.Auxiliar;

/**
 *
 * @author alulab14
 */
public interface DAOAuxiliar {
    ArrayList <Auxiliar> queryAll();
    Auxiliar queryAllByIDAuxiliar(int id);
    Auxiliar queryAllByNameAuxiliar(String name);
    int insertAuxiliar(Auxiliar auxiliar);
    int updateAuxiliar(Auxiliar auxiliar);
    int deleteAuxiliar(int id);
}
