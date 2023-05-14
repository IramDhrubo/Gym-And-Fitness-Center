/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class DashboardController implements Initializable {

    @FXML
    private BorderPane borderpane;
    @FXML
    private AnchorPane ap;
    @FXML
    private Label Tname;
    @FXML
    private Label TID;
    @FXML
    private Label Tmail;
    @FXML
    private Label Tcontact;
    @FXML
    private Label TAdd;
    @FXML
    private Label TWorkHour;
    @FXML
    private Label TstartDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void workoutroutineButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Create_and_personalize_workout_routines.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void monitorProgressButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Monitor_Members_Progress_towards_FitnessObjectives.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void monitorTechPerformButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Feedback_on_Workout_Technique.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void appointmentCalButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Manage_Schedule_Appointment.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void msgButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Message_Option.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void trackTargetButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Track_Fitness_Target.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void workIdeasButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Create_view_workout_Ideas.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void tipsButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane = FXMLLoader.load(getClass().getResource("Provide_Tips.fxml"));
        borderpane.getChildren().setAll(pane);
    }
    

    @FXML
    private void logoutbuttonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Login/LoginScene.fxml"));
        borderpane.getChildren().setAll(pane);
    }
    
    
}
