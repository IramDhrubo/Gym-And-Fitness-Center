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
public class Member {
    public String memberName;
    public String memberID;
    public String memberAddress;
    public String memberType;
    public String memberGender;
    public String memberAge;
    public String memberHeight;
    public String memberWeight;
    public String memberGoal;

    public Member(String memberName, String memberID, String memberAddress, String memberType, String memberGender, String memberAge, String memberHeight, String memberWeight, String memberGoal) {
        this.memberName = memberName;
        this.memberID = memberID;
        this.memberAddress = memberAddress;
    
        this.memberGender = memberGender;
        this.memberAge = memberAge;
        this.memberHeight = memberHeight;
        this.memberWeight = memberWeight;
        this.memberGoal = memberGoal;
    }

    public Member(String memberName, String memberID, String memberAddress, String memberGender, String memberAge, String memberHeight, String memberWeight, String memberGoal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    

    public String getMemberGender() {
        return memberGender;
    }

    public String getMemberAge() {
        return memberAge;
    }

    public String getMemberHeight() {
        return memberHeight;
    }

    public String getMemberWeight() {
        return memberWeight;
    }

    public String getMemberGoal() {
        return memberGoal;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    public void setMemberHeight(String memberHeight) {
        this.memberHeight = memberHeight;
    }

    public void setMemberWeight(String memberWeight) {
        this.memberWeight = memberWeight;
    }

    public void setMemberGoal(String memberGoal) {
        this.memberGoal = memberGoal;
    }

    /**
     *
     * @param memberID
     */
    public void searchMember(String memberID){
        
    }
    

    
    
    
}
