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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class Monitor_Members_Progress_towards_FitnessObjectivesController implements Initializable {

    @FXML
    private BorderPane borderpane;
    @FXML
    private ComboBox memListCombbox;
    @FXML
    private TextField memNameTextField;
    @FXML
    private TextField memIDTextField;
    @FXML
    private TextArea WorkoutLogTextArea;
    @FXML
    private Button BcktoDashboardButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReviewWorkoutLogButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BacktoDashboardButtonOnclick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        borderpane.getChildren().setAll(pane);
    }
    
}
