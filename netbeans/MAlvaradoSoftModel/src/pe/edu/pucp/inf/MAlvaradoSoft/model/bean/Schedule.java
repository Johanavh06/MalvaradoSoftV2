/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alulab14
 */
public class Schedule {
    private int idSchedule;
    private Classroom classroom;
    private ArrayList<Event> events;
    private ArrayList<Date> days;
    private Time startTime;
    private Time endTime;

    public Schedule() {
        classroom = new Classroom();
        events = new ArrayList<>();
        days = new ArrayList<>();
        startTime = new Time(0);
        endTime = new Time(0);
    }

    public Schedule(int idSchedule, Classroom classroom, ArrayList<Event> events, ArrayList<Date> days, Time startTime, Time endTime) {
        this.idSchedule = idSchedule;
        this.classroom = classroom;
        this.events = events;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public ArrayList<Date> getDays() {
        return days;
    }

    public void addDay(Date day) {
        this.days.add(day);
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    
}
