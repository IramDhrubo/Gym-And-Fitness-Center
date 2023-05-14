/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nutritionist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class Create_and_assign_meal_plansController implements Initializable {

    @FXML
    private ComboBox<?> memlistCombbox;
    @FXML
    private TextField memNameTextField;
    @FXML
    private TextField memIDTextField;
    @FXML
    private TableView<?> MealPlanTableView;
    @FXML
    private TableColumn<?, ?> daysColumn;
    @FXML
    private TableColumn<?, ?> breakfastColumn;
    @FXML
    private TableColumn<?, ?> lunchColumn;
    @FXML
    private TableColumn<?, ?> dinnerColumn;
    @FXML
    private Label toAchieveLabel;
    @FXML
    private Label allergyLabel;
    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
