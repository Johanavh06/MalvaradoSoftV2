/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.model.bean;

import java.sql.Time;

/**
 *
 * @author lenovo
 */
public class Event {
    private int idEvent;
    private Time startTime;    
    private Time endTime;
    private CourseSchedule courseSchedule;
    private int day;

    public Event() {
    }

    public Event(int idEvent, Time startTime, Time endTime, CourseSchedule courseSchedule, int day) {
        this.idEvent = idEvent;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseSchedule = courseSchedule;
        this.day = day;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
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

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
}
