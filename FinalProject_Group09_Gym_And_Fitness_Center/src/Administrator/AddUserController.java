/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator;

import Classes.Member;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class AddUserController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField uniqueIdTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private ComboBox userTypeComboBox;
    @FXML
    private TextField workingHourTextField;
    @FXML
    private Label workingHourLabel;
    
    public ArrayList<Member> memberArr = new ArrayList<Member>();
    @FXML
    private Label heightLabel;
    @FXML
    private TextField heightTextField;
    @FXML
    private Label ageLabel;
    @FXML
    private Label weightLabel;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField weightTextField;
    @FXML
    private TextField memberGoalTextField;
    @FXML
    private Label memberGoalLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("Member","Maintenance Staff","Trainer","Nutritionist","Receptionist", "Sales representative", "Physical Therapist");
    }    

    @FXML
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("MemberInformation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void addNewMemberOnApplyButtonClick(ActionEvent event) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String joiningDate =formatter.format(now);

        File userFile = null;
        FileWriter userFw = null;
        
        File memberFile = null;
        FileWriter memberFw = null;
        
        File maintenanceStaffFile = null;
        FileWriter maintenanceStaffFw = null;
        
        File nutritionistFile = null;
        FileWriter nutritionistFw = null;
        
        File trainerFile = null;
        FileWriter trainerFw = null;
        
        File receptionistFile = null;
        FileWriter receptionistFw = null;
        
        File salesRepresentativeFile = null;
        FileWriter salesRepresentativeFw = null;
        
        File physicalTherapistFile = null;
        FileWriter physicalTherapistFw = null;
        
        try {
            userFile = new File("UserList.txt");
            memberFile = new File("MemberList.txt");
            maintenanceStaffFile = new File("MaintenanceStaffList.txt");
            nutritionistFile = new File("NutritionistList.txt");
            trainerFile = new File("TrainerList.txt");
            receptionistFile = new File("ReceptionistList.txt");
            salesRepresentativeFile = new File("SalesRepresentativeList.txt");
            physicalTherapistFile = new File("PhysicalTherapistList.txt");
            
            if(userFile.exists()) {
                userFw = new FileWriter(userFile,true);
            }
            else {
                userFw = new FileWriter(userFile);
            }
            
            if(memberFile.exists()) {
                memberFw = new FileWriter(memberFile,true);
            }
            else {
                memberFw = new FileWriter(memberFile);
            }
            
            if(maintenanceStaffFile.exists()) {
                maintenanceStaffFw = new FileWriter(maintenanceStaffFile,true);
            }
            else {
                maintenanceStaffFw = new FileWriter(maintenanceStaffFile);
            }
            
            if(nutritionistFile.exists()) {
                nutritionistFw = new FileWriter(nutritionistFile,true);
            }
            else {
                nutritionistFw = new FileWriter(nutritionistFile);
            }
            
            if(trainerFile.exists()) {
                trainerFw = new FileWriter(trainerFile,true);
            }
            else {
                trainerFw = new FileWriter(trainerFile);
            }
            
            if(receptionistFile.exists()) {
                receptionistFw = new FileWriter(receptionistFile,true);
            }
            else {
                receptionistFw = new FileWriter(receptionistFile);
            }
            
            if(salesRepresentativeFile.exists()) {
                salesRepresentativeFw = new FileWriter(salesRepresentativeFile,true);
            }
            else {
                salesRepresentativeFw = new FileWriter(salesRepresentativeFile);
            }
            
            if(physicalTherapistFile.exists()) {
                physicalTherapistFw = new FileWriter(physicalTherapistFile,true);
            }
            else {
                physicalTherapistFw = new FileWriter(physicalTherapistFile);
            }
            
            
            if(maleRadioButton.isSelected())
            {
                String name = nameTextField.getText();
                String address = addressTextField.getText();
                String userType = userTypeComboBox.getValue().toString();
                String uniqueID = uniqueIdTextField.getText();
                String password = passwordField.getText();
                
                if(userTypeComboBox.getValue().toString().equals("Member")){
                    memberFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+heightTextField.getText()+","+ageTextField.getText()+","+weightTextField.getText()+","+memberGoalTextField.getText()+"\n");
                }
                else if(userTypeComboBox.getValue().toString().equals("Trainer")){
                    trainerFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+workingHourTextField.getText()+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Maintenance Staff")){
                    maintenanceStaffFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Nutritionist")){
                    nutritionistFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Physical Therapist")){
                    physicalTherapistFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Receptionist")){
                    receptionistFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Sales Representative")){
                    salesRepresentativeFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                
                userFw.write(name + "," +address + "," +userType +",MALE,"+uniqueID+","+password+"\n");         
            }
            else if(femaleRadioButton.isSelected())
            {
                String name = nameTextField.getText();
                String address = addressTextField.getText();
                String userType = userTypeComboBox.getValue().toString();
                String uniqueID = uniqueIdTextField.getText();
                String password = passwordField.getText();
                
                if(userTypeComboBox.getValue().toString().equals("Member")){
                    memberFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+heightTextField.getText()+","+ageTextField.getText()+","+weightTextField.getText()+","+memberGoalTextField.getText()+"\n");
                }
                else if(userTypeComboBox.getValue().toString().equals("Trainer")){
                    trainerFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+workingHourTextField.getText()+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Maintenance Staff")){
                    maintenanceStaffFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Nutritionist")){
                    nutritionistFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Physical Therapist")){
                    physicalTherapistFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Receptionist")){
                    receptionistFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                else if(userTypeComboBox.getValue().toString().equals("Sales Representative")){
                    salesRepresentativeFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+","+joiningDate+"\n");         
                }
                
                userFw.write(name + "," +address + "," +userType +",FEMALE,"+uniqueID+","+password+"\n");
            }
        } 
        catch (IOException ex) {
        //                   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if(userFw != null) {
                    userFw.close();
                }
                if(memberFw != null) {
                    memberFw.close();
                }
                if(trainerFw != null) {
                    trainerFw.close();
                }
                if(maintenanceStaffFw != null) {
                    maintenanceStaffFw.close();
                }
                if(receptionistFw != null) {
                    receptionistFw.close();
                }
                if(salesRepresentativeFw != null) {
                    salesRepresentativeFw.close();
                }
                if(physicalTherapistFw != null) {
                    physicalTherapistFw.close();
                }
                if(nutritionistFw != null) {
                    nutritionistFw.close();
                }
            } 
            catch (IOException ex) {
             //   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void userTypeOnClick(ActionEvent event) {
        if(userTypeComboBox.getValue().toString().equals("Trainer")){
            workingHourLabel.setVisible(true);
            workingHourTextField.setVisible(true);
        }
        else{
            workingHourLabel.setVisible(false);
            workingHourTextField.setVisible(false);
        }
        
        if(userTypeComboBox.getValue().toString().equals("Member")){
            heightTextField.setVisible(true);
            ageTextField.setVisible(true);
            weightTextField.setVisible(true);
            memberGoalTextField.setVisible(true);
            heightLabel.setVisible(true);
            ageLabel.setVisible(true);
            weightLabel.setVisible(true);
            memberGoalLabel.setVisible(true);
        }
        else{
            heightTextField.setVisible(false);
            ageTextField.setVisible(false);
            weightTextField.setVisible(false);
            memberGoalTextField.setVisible(false);
            heightLabel.setVisible(false);
            ageLabel.setVisible(false);
            weightLabel.setVisible(false);
            memberGoalLabel.setVisible(false);
        }
    }
    
}
