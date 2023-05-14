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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class CheckInventoryController implements Initializable {

    @FXML
    private TextField itemNameTextField;
    @FXML
    private TextField addItemQuantityTextField;
    @FXML
    private TextField updateItemQuantityTextField;
    @FXML
    private ComboBox selectItemNameToUpdateComboBox;
    @FXML
    private ComboBox selectItemNameToSearchComboBox;
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
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
    
}
