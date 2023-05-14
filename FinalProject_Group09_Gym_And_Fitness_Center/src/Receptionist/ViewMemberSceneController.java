/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import Classes.MemberDetails;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class ViewMemberSceneController implements Initializable {
    
    private MemberDetails selectedMember;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label dateOfjoiningLabel;
    @FXML
    private Label timeLabel;

    /**
     * Initializes the controller class.
     * @param m
     */
    
    public void initData(MemberDetails m){
        selectedMember = m;
        firstNameLabel.setText(selectedMember.getFirstName());
        lastNameLabel.setText(selectedMember.getLastName());
        dateOfjoiningLabel.setText(selectedMember.getJoiningDate().toString());
        timeLabel.setText(Integer.toString(selectedMember.getTime())+" years");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("MembersDetails.fxml"));
         anchorPane.getChildren().setAll(pane);
    }
    
}
