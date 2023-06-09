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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class EventPlanningController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ListView listView;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.getItems().addAll("Free Classes","Referral Program","Pull-up Contest","30-days Challenge diet Contest","Special Event - yoga classes","Photo Contest");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void backToDashboadOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
         anchorPane.getChildren().setAll(pane);
    }
    
}
