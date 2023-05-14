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

    Stage stage;
    @FXML
    private TextArea credTextArea;
    @FXML
    private TextField enterIDTextField;
    @FXML
    private TextField nameTextField;

    @FXML
    private void showButtonOnClick(ActionEvent event) {
         String id = enterIDTextField.getText();
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
    private void memberdEtailsButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MembersDetails.fxml"));
        anchorPane.getChildren().setAll(pane);

    }

    @FXML
    private void scheduleButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void transactionButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Transactions.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void inventoryButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void supportButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Support.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void mailButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Mail.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void querybBoxButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("QueryBox.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
        stage = (Stage) anchorPane.getScene().getWindow();
        //System.out.println("Successfully loggedout!");
        stage.close();

    }

}
