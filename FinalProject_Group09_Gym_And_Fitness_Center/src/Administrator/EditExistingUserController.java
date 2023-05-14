/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class EditExistingUserController implements Initializable {

    @FXML
    private ComboBox typeOfUserComboBox;
    @FXML
    private ComboBox nameAndIDComboBox;
    @FXML
    private ComboBox updateTypeOfUserComboBox;
    @FXML
    private ComboBox updateGenderComboBox;
    @FXML
    private TextField updateAddressTextField;
    @FXML
    private TextField updateNameComboBox;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeOfUserComboBox.getItems().addAll("Member","Maintainance Staff","Trainer","Nutritionist","Receptionist", "Sales representative", "Physical Therapist");
        updateTypeOfUserComboBox.getItems().addAll("Member","Maintainance Staff","Trainer","Nutritionist","Receptionist", "Sales representative", "Physical Therapist");
        updateGenderComboBox.getItems().addAll("Male","Female");
    }    

    @FXML
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("MemberInformation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void updateUserDetailsOnClick(ActionEvent event) {
        
    }
    
}
