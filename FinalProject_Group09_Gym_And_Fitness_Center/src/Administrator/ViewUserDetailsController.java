/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator;

import Classes.User;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lobo
 */
public class ViewUserDetailsController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField searchTextArea;
    @FXML
    private TableView<User> viewUserTable;
    @FXML
    private TableColumn<User, String> userName;
    @FXML
    private TableColumn<User, String> userUniqueID;
    @FXML
    private TableColumn<User, String> userAddress;
    @FXML
    private TableColumn<User, String> userType;
    @FXML
    private TableColumn<User, String> gender;

    public ArrayList<User> userArr = new ArrayList<User>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        userUniqueID.setCellValueFactory(new PropertyValueFactory<>("userUniqueID"));
        userAddress.setCellValueFactory(new PropertyValueFactory<>("userAddress"));
        userType.setCellValueFactory(new PropertyValueFactory<>("userType"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        File f = null;
        Scanner sc; 
        String str; 
        String[] tokens;
        try {
            f = new File("UserList.txt");
            sc = new Scanner(f);
            if(f.exists()){
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    userArr.add(new User(tokens[0],tokens[4],tokens[1],tokens[2],tokens[3]));           
                }
                
                for(int i=0; i<userArr.size();i++){
                    User newUser = new User(userArr.get(i).userName,userArr.get(i).userUniqueID,userArr.get(i).userAddress,userArr.get(i).userType,userArr.get(i).gender);
                    viewUserTable.getItems().add(newUser);
                }
            }
        } 
        catch (IOException ex) {
            //Logger.getLogger(NoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        } 
    }    

    @FXML
    private void backToAdministratorDashboardButtonOnClick(ActionEvent event) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("MemberInformation.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
        viewUserTable.getItems().clear();
        String searchName = searchTextArea.getText();
        for(int i=0; i<userArr.size();i++){
            if(userArr.get(i).userName.equals(searchName) ){        
                User newUser = new User(userArr.get(i).userName,userArr.get(i).userUniqueID,userArr.get(i).userAddress,userArr.get(i).userType,userArr.get(i).gender);
                viewUserTable.getItems().add(newUser);
            }
            if(searchName.equals("")){
                User newUser = new User(userArr.get(i).userName,userArr.get(i).userUniqueID,userArr.get(i).userAddress,userArr.get(i).userType,userArr.get(i).gender);
                viewUserTable.getItems().add(newUser);
            }
        }
    }
}
