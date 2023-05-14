/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales_Representative;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class DashboardController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextArea credTextArea;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField nameTextField;

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String id = idTextField.getText();
        String name = nameTextField.getText();
        
        credTextArea.appendText(id + "\n");
        credTextArea.appendText(name + "\n");

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void membershipOptionsButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MembershipOptions.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void developmentPlanButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("DevelopmentPlan.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void financialTransactionsbuttonOnClick(ActionEvent event) {

    }

    @FXML
    private void eventPlanningbuttonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("EventPlanning.fxml"));
        anchorPane.getChildren().setAll(pane);

    }

    @FXML
    private void marketStrategybuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void supportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void saleInformationbuttonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Sales_Info.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        System.out.println("Successfully loggedout!");
        stage.close();
    }

}
