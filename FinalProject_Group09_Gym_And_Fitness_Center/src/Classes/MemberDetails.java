/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarah Mahbub
 */
public class MemberDetails implements Serializable {

    private String firstName, lastName;
    private LocalDate joiningDate;

    public MemberDetails(String firstName, String lastName, LocalDate joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        saveMember();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getFirstName() {
        //return firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getTime() {
        return Period.between(joiningDate, LocalDate.now()).getYears();
    }

    public void display() {
        System.out.println("FirstName=" + firstName + ", LastName=" + lastName + ", DateOfJoining=" + joiningDate);
    }

    public static List<MemberDetails> loadMember() {
        List<MemberDetails> members = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("memberDetails.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            members = (List<MemberDetails>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error Loading File");
        }
        return members;
    }

    public void saveMember() {
        List<MemberDetails> membersList = new ArrayList<>(loadMember());
        boolean duplicate = false;
        for (MemberDetails m : membersList) {
            if (m.equals(this)) {
                duplicate = true;
                break;
            }
        }
        if (duplicate) {
            System.out.println("Member Exists");
        } else {
            membersList.add(this);
            try (FileOutputStream fos = new FileOutputStream("memberDetails.bin", false);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(membersList);
                oos.close();
                fos.close();
                System.out.println("Saved");
            } catch (IOException e) {
                System.out.println("Error writing file");
            }
        }
    }

    //  @Override
//    
//    public String toString(){
//       
//       return "FirstName="+firstName+", LastName="+lastName+", DateOfJoining="+joiningDate;
//    } 
}
