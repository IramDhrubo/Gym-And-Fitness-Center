/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaintenanceStaff;

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
 * @author ASUS VivoBook
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
    private void listOfEquipmentButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("GymEquipment.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void repairIssuesButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("EquipmentRepairsIssues.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void createScheduleButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CreateSchedule.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void cleanlinessButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MonitorToEnsureCleanliness.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void memberFeedbackButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MembersFeedback.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void employeeFeedbackButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("AnalyzeFeedback.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void emergencySituationButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("EmergencySituation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void gymRisksButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RiskInAGym.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
