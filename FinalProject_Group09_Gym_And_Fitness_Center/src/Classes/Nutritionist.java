/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ac
 */
public class Nutritionist {
    public String userName;
    public String userID;
    public String userAddress;
    public String userContact;
    public String gender;
    public String workingHour;
    public String joiningDate;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWorkingHour(String workingHour) {
        this.workingHour = workingHour;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserContact() {
        return userContact;
    }

    public String getGender() {
        return gender;
    }

    public String getWorkingHour() {
        return workingHour;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public Nutritionist(String userName, String userID, String userAddress, String userContact, String gender, String workingHour, String joiningDate) {
        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
        this.userContact = userContact;
        this.gender = gender;
        this.workingHour = workingHour;
        this.joiningDate = joiningDate;
    }
}
