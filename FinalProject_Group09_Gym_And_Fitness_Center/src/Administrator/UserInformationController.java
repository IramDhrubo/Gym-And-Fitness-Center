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
public class UserInformationController implements Initializable {

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
    private void viewMemberInformationButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("ViewUserDetails.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void editExistingMemberButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("EditExistingUser.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void addNewMemberButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("AddUser.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void deleteAMemberButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("DeleteUser.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
