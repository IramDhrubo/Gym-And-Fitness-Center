/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField UserEmailTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button loginButton;
    @FXML
    private Button forgetpassButton;
    @FXML
    private ComboBox userTypeCombbox;
    @FXML
    private AnchorPane anchorpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeCombbox.getItems().addAll("Administrator","Member","Maintainance Staff","Trainer","Nutritionist","Receptionist", "Sales representative", "Physical Therapist");
    }    

    @FXML
    private void LoginButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("/Trainer/Dashboard.fxml"));
        anchorpane.getChildren().setAll(pane);
    }

    @FXML
    private void forgetpassButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("ForgetPassword.fxml"));
        anchorpane.getChildren().setAll(pane);
    }
    
}
