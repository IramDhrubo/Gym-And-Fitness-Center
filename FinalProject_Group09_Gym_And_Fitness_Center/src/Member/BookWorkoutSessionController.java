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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ASUS VivoBook
 */
public class BookWorkoutSessionController implements Initializable {

    @FXML
    private ComboBox bookWorkoutTime;
    @FXML
    private DatePicker bookWorkoutDatePicker;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bookWorkoutTime.getItems().addAll("10:00 am to 12:00 pm","12:30 pm to 2:30 pm","4:00 pm to 6:00 pm");
    }    

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
