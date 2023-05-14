/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import java.time.LocalDate;

/**
 *
 * @author Ac
 */
public class WorkoutRoutineList {
    String memID, type, tableTime;
    LocalDate  dateAssigned;
    String WarmupReq;

    public WorkoutRoutineList(String memberId, String workoutName, LocalDate localDate, String times, String WarmupReq) {
        this.memID = memberId;
        this.type = workoutName;
        this.tableTime = times;
        this.dateAssigned = localDate;
        this.WarmupReq = WarmupReq;
    }

    public String getMemID() {
        return memID;
    }

    public void setMemID(String memID) {
        this.memID = memID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTableTime() {
        return tableTime;
    }

    public void setTableTime(String tableTime) {
        this.tableTime = tableTime;
    }

    public LocalDate getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(LocalDate dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public String getWarmupReq() {
        return WarmupReq;
    }

    public void setWarmupReq(String WarmupReq) {
        this.WarmupReq = WarmupReq;
    }



}