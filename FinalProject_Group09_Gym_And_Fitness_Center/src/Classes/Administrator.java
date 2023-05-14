/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author lobo
 */
public class Administrator {
    
    public String userName;
    public String userID;
    public String userAddress;
    public String userContact;
    public String gender;
    public String joiningDate;
    
    public Administrator(String userName, String userID, String userAddress, String userContact, String gender, String joiningDate) {
        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
        this.userContact = userContact;
        this.gender = gender;
        this.joiningDate = joiningDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    
}
