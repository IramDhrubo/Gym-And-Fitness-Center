/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import Classes.WorkoutRoutine;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Ac
 */
public class Create_view_workout_IdeasController implements Initializable {

    @FXML
    private TableView<WorkoutRoutine> workoutideaTableView;
    @FXML
    private Button ViewIdeasButton;
    @FXML
    private TextArea AddIdeaTextField;
    @FXML
    private Button AddIdeaButton;
    @FXML
    private Button DashboardButton;
    @FXML
    private TextArea ToAchieveTextField;
    @FXML
    private BorderPane borderpane;
    @FXML
    private TableColumn<WorkoutRoutineList, String> ToAchieveColumn;
    @FXML
    private TableColumn<WorkoutRoutineList, String> IdeasColumn;
    
    
  //  private ArrayList<WorkoutRoutine> workoutArr;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void ViewIdeasButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void AddIdeaButtonOnClick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        try {
            f = new File("WorkoutIdeasList.txt");      
            if(f.exists()) {
                fw = new FileWriter(f,true);
            }
            else{
                fw = new FileWriter(f);
            }
            
            fw.write(ToAchieveTextField.getText() + ": " +AddIdeaTextField.getText()+ "\n");         
           
           } 
        catch (IOException ex) {
        //                   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
             //   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void BacktoDashboardButtonOnClick(ActionEvent event) throws IOException {
        BorderPane pane;
        pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        borderpane.getChildren().setAll(pane);

    }
    
}
