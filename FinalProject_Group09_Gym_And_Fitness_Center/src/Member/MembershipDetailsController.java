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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ASUS VivoBook
 */
public class MembershipDetailsController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox monthComboBox;
    @FXML
    private ComboBox amountComboBox;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ComboBox methodComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        amountComboBox.getItems().addAll("500","1000");
        methodComboBox.getItems().addAll("Bkash","Nagad","Upay");
    }    

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
