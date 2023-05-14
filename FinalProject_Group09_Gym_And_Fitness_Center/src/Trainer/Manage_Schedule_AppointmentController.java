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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class Manage_Schedule_AppointmentController implements Initializable {

    @FXML
    private DatePicker AppointmentDatePicker;
    @FXML
    private TextField StartTimeTextField;
    @FXML
    private TextField EndTimeTextField;
    @FXML
    private ComboBox<?> memListCombbox;
    @FXML
    private TextField memNameTextField;
    @FXML
    private TextField memIDTextField;
    @FXML
    private TextArea NoteTextArea;
    @FXML
    private Button SaveNoteButton;
    @FXML
    private Button BcktoDashboardButton;
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
    private void SaveNoteuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void BcktoDashboardButtonOnclick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        borderpane.getChildren().setAll(pane);

    }
    
}
