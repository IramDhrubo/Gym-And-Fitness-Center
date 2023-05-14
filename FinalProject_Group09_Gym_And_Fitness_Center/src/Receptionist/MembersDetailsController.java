/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import Classes.MemberDetails;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class MembersDetailsController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ComboBox membershipComboBox;
    @FXML
    private TableView<MemberDetails> viewTable;
    @FXML
    private TableColumn<MemberDetails, String> firstNameColumn;
    @FXML
    private TableColumn<MemberDetails, String> lastNamecolumn;
    @FXML
    private TableColumn<MemberDetails, LocalDate> dateOfjoiningColumn;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private DatePicker joiningDatePicker;
    @FXML
    private Label membershipLabel;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @FXML
    private void membershipComboBoxIsUpdated(ActionEvent event) {
        this.membershipLabel.setText("Selected Membership is: " + membershipComboBox.getValue().toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        membershipComboBox.getItems().addAll("Star", "VIP", "General");
        membershipComboBox.setValue("General");
        membershipLabel.setText("Selected Membership is: General");

        //set up the columns in the table
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNamecolumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        dateOfjoiningColumn.setCellValueFactory(new PropertyValueFactory<>("joiningDate"));

        //load dummy data
        viewTable.setItems(FXCollections.observableArrayList(MemberDetails.loadMember()));

        //Allow first and last name to be edittable
        viewTable.setEditable(true);
        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNamecolumn.setCellFactory(TextFieldTableCell.forTableColumn());

        //allow the table to select multiple rows at once
        viewTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @FXML
    private void backtoDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    private void addMemberButtonOnClick(ActionEvent event) {
        LocalDate Date = joiningDatePicker.getValue();
        MemberDetails newMember = new MemberDetails(firstNameTextField.getText(),
                lastNameTextField.getText(),
                Date
        );
        viewTable.setItems(FXCollections.observableArrayList(MemberDetails.loadMember()));
    }

    private ObservableList getMember() {
        ObservableList<MemberDetails> member = FXCollections.observableArrayList();

        return member;
    }

    @FXML
    private void detailedMemberViewButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewMemberScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene viewMemberScene = new Scene(personViewParent);

        //access the controller
        ViewMemberSceneController controller = loader.getController();

        //controller = new PersonViewSceneController();
        controller.initData(viewTable.getSelectionModel().getSelectedItem());

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(viewMemberScene);
        window.show();
    }

    @FXML
    private void lastNameTxtOnMouseClick(MouseEvent event) {
        lastNameTextField.setText(null);
    }

    @FXML
    private void firstNameTxtOnMouseClick(MouseEvent event) {
        firstNameTextField.setText(null);
    }


    @FXML
    private void deleteMemberButtonOnClick(ActionEvent event) {
//        // read all objects from file into a list
        ObservableList<MemberDetails> members = viewTable.getItems();

// remove desired object from list
        MemberDetails selected = viewTable.getSelectionModel().getSelectedItem();
        members.remove(selected);

// write updated list back to file
        if (members.isEmpty()) {
            File file = new File("memberDetails.bin");
                if (file.exists()) {
                    if (file.delete()) {
                        System.out.println("file deleted");
                    } else {
                        System.out.println("Error deleting file");
                    }
                }
        } else {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("memberDetails.bin", false))) {
                oos.writeObject(members);
                System.out.println("Object deleted and file updated successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error writing to file.");
            }
        }
// update the table view
        viewTable.setItems(FXCollections.observableArrayList(members));
    }

}
