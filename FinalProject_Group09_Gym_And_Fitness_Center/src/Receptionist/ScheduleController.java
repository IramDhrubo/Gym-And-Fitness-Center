/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class ScheduleController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private RadioButton trainerScheduleRadioButton;
    @FXML
    private RadioButton memberScheduleRadioButton;
    @FXML
    private RadioButton physiotherapistScheduleRadioButton;
    @FXML
    private RadioButton nutritionistScheduleRadioButton;
    private Label radiobuttonlLabel;
    private ToggleGroup scheduleToggleGroup;
    @FXML
    private Label radioButtonLabel;
    

    
    
    
    public void radioButtonChanged()
    {
        if (this.scheduleToggleGroup.getSelectedToggle().equals(this.trainerScheduleRadioButton))
            radioButtonLabel.setText("The selected schedule is: Trainer Schedule");
        
        if (this.scheduleToggleGroup.getSelectedToggle().equals(this.memberScheduleRadioButton))
            radioButtonLabel.setText("The selected schedule is: Member Schedule");
        
        if (this.scheduleToggleGroup.getSelectedToggle().equals(this.physiotherapistScheduleRadioButton))
            radioButtonLabel.setText("The selected schedule is: physiotherapist Schedule");
        
        if (this.scheduleToggleGroup.getSelectedToggle().equals(this.nutritionistScheduleRadioButton))
            radioButtonLabel.setText("The selected schedule is: Nutrionist Schedule");
        
    }
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       radioButtonLabel.setText("");
        scheduleToggleGroup = new ToggleGroup();
        this.trainerScheduleRadioButton.setToggleGroup(scheduleToggleGroup);
        this.memberScheduleRadioButton.setToggleGroup(scheduleToggleGroup);
        this.physiotherapistScheduleRadioButton.setToggleGroup(scheduleToggleGroup);
        this.nutritionistScheduleRadioButton.setToggleGroup(scheduleToggleGroup);
        
    }    

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
         anchorPane.getChildren().setAll(pane);
    }
    
}
