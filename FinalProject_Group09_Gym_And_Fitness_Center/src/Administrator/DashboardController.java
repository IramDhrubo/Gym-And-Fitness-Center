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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkInventoryButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("CheckInventory.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void gymPoliciesButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("GymPolicies.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void memberInformationButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("UserInformation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void responseToComplainButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("ResponseToComplain.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void setTrainerAndReceptionistScheduleButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("ScheduleTrainerAndReceptionist.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void setMeetingScheduleButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("SetMeetingSchedule.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
