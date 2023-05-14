/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Trainer.WorkoutRoutineList;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lobo
 */
public class WorkoutRoutine2 {
    public LocalDate Date;
    public String MemberID;
    public String WorkoutType;
    public String Times;
    public String WarmupReq;

    public WorkoutRoutine2(LocalDate Date, String MemberID, String WorkoutType, String Times, String WarmupReq) {
        this.Date = Date;
        this.MemberID = MemberID;
        this.WorkoutType = WorkoutType;
        this.Times = Times;
        this.WarmupReq = WarmupReq;
        addToWorkoutBIN(MemberID);
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public String getWorkoutType() {
        return WorkoutType;
    }

    public void setWorkoutType(String WorkoutType) {
        this.WorkoutType = WorkoutType;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String Times) {
        this.Times = Times;
    }

    public String getWarmupReq() {
        return WarmupReq;
    }

    public void setWarmupReq(String WarmupReq) {
        this.WarmupReq = WarmupReq;
    }

    public void addToWorkoutBIN(String MemberID){
        ArrayList<WorkoutRoutineList> member = new ArrayList<>();
        
        try {
            FileOutputStream fos = new FileOutputStream("WorkoutData.bin", true);
            DataOutputStream dos = new DataOutputStream(fos);
                for(WorkoutRoutineList m: member){
                    dos.writeUTF(m.getMemID());
                    dos.writeUTF(m.getTableTime());
                    dos.writeUTF(m.getType());
                    dos.writeUTF(m.getWarmupReq());
                }
                dos.close();
        } 
        
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error Loading File");
        }
        
    }
    
}
