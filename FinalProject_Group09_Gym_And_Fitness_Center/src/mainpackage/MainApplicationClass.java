/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lobo
 */
public class MainApplicationClass extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Trainer/Create_and_personalize_workout_routines.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/MaintenanceStaff/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Member/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Login/ForgetPassword.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Administrator/ViewMemberDetails.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Administrator/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Administrator/AddUser.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/PhysicalTherapist/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Trainer/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Nutritionist/Nutritionist_Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Sales_Representative/Dashboard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Receptionist/Dashboard.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
