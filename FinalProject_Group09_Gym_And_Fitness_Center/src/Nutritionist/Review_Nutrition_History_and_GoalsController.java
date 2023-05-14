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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class Review_Nutrition_History_and_GoalsController implements Initializable {

    @FXML
    private TextField memberIDTextField;
    @FXML
    private TextArea ViewHistoryTextField;
    @FXML
    private Button DashboardButton;
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
    private void ViewIHistoryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BacktoDashboardButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Nutritionist_Dashboard.fxml"));
        borderpane.getChildren().setAll(pane);
    }
    
}
