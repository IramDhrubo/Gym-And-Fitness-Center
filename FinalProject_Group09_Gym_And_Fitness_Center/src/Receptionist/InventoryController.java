/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


    

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class InventoryController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label inventoryListLabel;
    @FXML
    private ListView listView;
    @FXML
    private TextArea listTextArea;

   
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         listView.getItems().addAll("Dumbbell = 20","Training Bench = 15","Barbell = 20","Pull-Up Frame = 10","Bar = 20","Free Weights = 30");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
         anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void selectInventoryButtonOnClick(ActionEvent event) {
        {
        String textAreaString = "";
        
        ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();
        
        for (Object item : listOfItems)
        {
            textAreaString += String.format("%s%n",(String) item);
        }
        
        this.listTextArea.setText(textAreaString);
    }
    }
}
