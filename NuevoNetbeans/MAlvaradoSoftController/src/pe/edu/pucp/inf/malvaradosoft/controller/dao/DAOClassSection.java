/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.ClassSection;

/**
 *
 * @author alulab14
 */
public interface DAOClassSection {
    ArrayList <ClassSection> queryAll();
    ArrayList <ClassSection> queryByLevel(int level);
    int insert(ClassSection classSection);
    int update(ClassSection classSection);
    int delete(int idclassSection);
}
