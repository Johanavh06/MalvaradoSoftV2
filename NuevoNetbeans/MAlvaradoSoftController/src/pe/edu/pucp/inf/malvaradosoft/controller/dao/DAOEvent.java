/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.malvaradosoft.model.bean.Event;

/**
 *
 * @author alulab14
 */
public interface DAOEvent {
    int insertEvent(Event e);
    int deleteEvent (Event e);
    ArrayList<Event> queryAllEventsByCourse(int idCourse);
    ArrayList<Event> queryAllEventsByDay(int day);
}
