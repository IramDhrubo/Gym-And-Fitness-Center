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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class SetMeetingScheduleController implements Initializable {

    @FXML
    private TextArea setMeetingAgendaTextArea;
    @FXML
    private ComboBox selectTypeOfStaffComboBox;
    @FXML
    private DatePicker selectMeetingDateDatePicker;
    @FXML
    private ComboBox selectNameComboBox;
    @FXML
    private ComboBox selectMeetingTimeComboBox;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectTypeOfStaffComboBox.getItems().addAll("Maintenance Staff", "Trainer", "Nutritionist", "Receptionist", "Physical Therapist");
        selectMeetingTimeComboBox.getItems().addAll("5:00 pm","6:00 pm","7:00 pm");
    }    

    @FXML
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
