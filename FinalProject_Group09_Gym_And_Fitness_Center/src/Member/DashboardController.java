/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BookWorkoutSessionOnCLick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("BookWorkoutSession.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void GymSupplementsOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("GymSupplement.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void HealthIndicatorsOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("HealthIndicators.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void SetFitnessMilestonesOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SetFitnessMilestones.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void MembershipDetailsOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MembershipDetails.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void PlansAndTipsOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("WorkoutPlans.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void TrackProgressOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("TrackProgress.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void FitnessCommunityOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FitnessCommunity.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
