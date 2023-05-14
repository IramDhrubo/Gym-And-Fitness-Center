/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nutritionist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class Nutritionist_DashboardController implements Initializable {

    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void createMealPlanButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Create_and_assign_meal_plans.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void feedbackButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Feedback_on_food_choices.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void messageOptionButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Message_Option.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void tipsButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Offer_Educational_Resources___Tips.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void reviewHistoryButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Review_Nutrition_History_and_Goals.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void appointmentButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Manage_Appointments.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void trackFoodButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Track_members__Food_intake.fxml"));
        borderpane.getChildren().setAll(pane);
    }

    @FXML
    private void setMilestoneButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Set_Nutrition_Milestones.fxml"));
        borderpane.getChildren().setAll(pane);
    }
    
}
