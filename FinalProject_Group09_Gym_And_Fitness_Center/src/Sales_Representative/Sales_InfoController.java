/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales_Representative;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class Sales_InfoController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private PieChart pieChart;
    @FXML
    private Button loadPieChartButton;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void labelMouseEnterOnclick(MouseEvent event) {
        statusLabel.setText("You are hoovering on the label");
    }

    @FXML
    private void loadPieChartButtononClick(ActionEvent event) {
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Inventoey", 50),
                new PieChart.Data("Supplies", 20),
                new PieChart.Data("Personal Trainer", 30),
                new PieChart.Data("Nutrionist", 10),
                new PieChart.Data("Physiotherapist", 15)
        );

        
        pieChart.setData(list);

        for (PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    
                }
            }
            );
        }
    }

}
