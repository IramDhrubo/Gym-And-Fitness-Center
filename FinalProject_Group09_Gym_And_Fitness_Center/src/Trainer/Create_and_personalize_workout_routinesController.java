/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import Classes.Member;
import Classes.WorkoutRoutine2;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class Create_and_personalize_workout_routinesController implements Initializable {

    @FXML
    private BorderPane borderpane;
    @FXML
    private DatePicker datepicker;
    @FXML
    private ComboBox<String> workoutType;
    @FXML
    private TextField timesTextField;
    @FXML
    private Pane viewTablePane;
    @FXML
    private TableView<WorkoutRoutineList> WorkoutRoutineTableview;
    @FXML
    private TableColumn<WorkoutRoutineList, LocalDate> dateColumn;
    @FXML
    private TableColumn<WorkoutRoutineList, String> memberIDColumn;
    @FXML
    private TableColumn<WorkoutRoutineList, String> workoutColumn;
    @FXML
    private TableColumn<WorkoutRoutineList, String> timesColumn;

    private ArrayList<Member> memArray = new ArrayList<>();
    @FXML
    private TextField memberIDTextField;
    @FXML
    private CheckBox isWarmupRequiredCheckBox;
    @FXML
    private TableColumn<WorkoutRoutineList, String> warmupRequiredColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        workoutType.getItems().addAll("PushUps","Pullups","");

        viewTablePane.setVisible(false);
        
    }    
   

    @FXML
    private void BacktoDashboardButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        borderpane.getChildren().setAll(pane);
    }
  

    @FXML
    private void AddWorkoutButtonOnClick(ActionEvent event) throws IOException {
           String memID = memberIDTextField.getText();
           String workType =workoutType.getValue();
           LocalDate selectedDate = datepicker.getValue();
           System.out.println("Selected date: " + selectedDate);
           String Time =  timesTextField.getText();
           String WarmupReq = null;
           
           if(isWarmupRequiredCheckBox.isSelected()){
               WarmupReq = "SELECTED";
           }
           else{
               WarmupReq = "NOT SELECTED";
           }
           
        
           WorkoutRoutine2 WR = new WorkoutRoutine2(selectedDate, memID, workType, Time, WarmupReq);

        workoutType.getItems().clear();
        timesTextField.clear();
        datepicker.setValue(null);
    
    }

    @FXML
    private void ViewRoutineButtonOnClick(ActionEvent event) {
        viewTablePane.setVisible(true);
       
        FileInputStream fis = null;
        DataInputStream dis = null;
        File f = null;
        try {
            f = new File("WorkoutData.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                
                
            }
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Create_and_personalize_workout_routinesController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    
        memberIDColumn.setCellValueFactory(new PropertyValueFactory<>("memID"));
        workoutColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dateAssigned"));
        timesColumn.setCellValueFactory(new PropertyValueFactory<>("tableTime"));
        warmupRequiredColumn.setCellValueFactory(new PropertyValueFactory<>("warmupRequired"));
        
    }
}

  

   
