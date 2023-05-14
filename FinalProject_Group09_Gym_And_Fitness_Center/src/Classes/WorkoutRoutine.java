/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


/**
 *
 * @author Ac
 */
public class WorkoutRoutine {
    public LocalDate Date;
    public String MemberID;
    public String WorkoutName;
    public String Times;
    public String ToAchieve;


    public WorkoutRoutine( String MemberID, String WorkoutName, LocalDate Date,String Times) {
        this.Date = Date;
        this.MemberID = MemberID;
        this.WorkoutName = WorkoutName;
        this.Times = Times;
       // System.out.println("Inside WorkoUT CLASS" );
        addToWorkoutTXT(MemberID);
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getMemberID() {
        return MemberID;
    }

    public String getWorkoutName() {
        return WorkoutName;
    }

    public String getTimes() {
        return Times;
    }

    public String getToAchieve() {
        return ToAchieve;
    }
    
   
    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public void setWorkoutName(String WorkoutName) {
        this.WorkoutName = WorkoutName;
    }

    public void setTimes(String Times) {
        this.Times = Times;
    }

    public void setToAchieve(String ToAchieve) {
        this.ToAchieve = ToAchieve;
    }
    
    public void addToWorkoutTXT(String MemberID){
       // String id = this.MemberID;
         File f = null;
        FileWriter fw = null;
        try {
            f = new File(MemberID+"_WorkoutRoutine.txt");      
            if(f.exists()) {
                fw = new FileWriter(f,true);
            }
            else{
                fw = new FileWriter(f);
            }
            
            fw.write(this.MemberID+ "//" +this.WorkoutName+ "//" +this.Date+ "//" +this.Times +"\n");      
            System.out.println("File Wrote" );
           
           } 
        catch (IOException ex) {
        //                   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erorr" );

        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
             //   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
