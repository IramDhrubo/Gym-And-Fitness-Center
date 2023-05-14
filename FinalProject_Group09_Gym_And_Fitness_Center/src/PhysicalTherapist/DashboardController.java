/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysicalTherapist;

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
    private void collaborationWithNutritionistButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CollaborateWithNutritionist.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void emergencyTreatmentButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("EmergencyTreatment.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void makeAppointmentButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MakeAppointment.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void wellnessTipsButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("ProvideWellnessTips.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void rehabilitiationPlanButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RehabilitiationPlan.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void rehabilitiationProgressButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RehabilitiationProgress.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void setFitnessMilestonesButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SetFitnessMilestone.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void therapyInformationButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("TherapyInformation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
