/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import Classes.Transaction;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class TransactionsController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField transactionTextField;
    @FXML
    private TextField dueTransactionTextField;

    @FXML
    private TableColumn<Transaction, String> transactionColumnTableView;
    @FXML
    private TableColumn<Transaction, String> dueTableViewColumn;
    @FXML
    private TableView<Transaction> TableView;
    @FXML
    private Pane viewTablePane;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TableColumn<Transaction, String> userIDColumnTableView;
    @FXML
    private TableColumn<Transaction, LocalDate> dateColumnTableView;
    @FXML
    private DatePicker transactionDatepicker;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userIDColumnTableView.setCellValueFactory(new PropertyValueFactory<>("userID"));
        dateColumnTableView.setCellValueFactory(new PropertyValueFactory<>("transactionDatepicker"));
        transactionColumnTableView.setCellValueFactory(new PropertyValueFactory<>("transaction"));
        dueTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("due"));

        viewTablePane.setVisible(false);
    }

    @FXML
    private void addTransactionButtonClick(ActionEvent event) {
        Transaction newTransaction = new Transaction(userIDTextField.getText(),
                transactionDatepicker.getValue(),
                transactionTextField.getText(),
                dueTransactionTextField.getText()
        );
        TableView.getItems().add(newTransaction);

        LoadTransaction();
    }

    @FXML
    private void firstNametxtFieldMouseOnClick(MouseEvent event) {

    }

    @FXML
    private void transactionTxtFieldMouseOnClick(MouseEvent event) {
    }

    @FXML
    private void duetxtFieldMouseOnClick(MouseEvent event) {
    }

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        anchorPane.getChildren().setAll(pane);
    }

    private ObservableList<Transaction> getTransaction() {
        ObservableList<Transaction> transaction = FXCollections.observableArrayList();

        return transaction;
    }

    @FXML
    private void viewTransactionButtonOnClick(ActionEvent event) {
        viewTablePane.setVisible(true);
        LoadTransaction();
    }

    private ObservableList LoadTransaction() {
        
        ObservableList<Transaction> tr = FXCollections.observableArrayList();
        ArrayList arrList = Transaction.LoadTransaction(userIDTextField.getText());
        String userID, transaction, due;
        LocalDate transactionDate;

        String str;

        String[] tokens;

        for (int i = 0; i < arrList.size(); i++) {
            str = arrList.get(i).toString();
            tokens = str.split("//");
            if (tokens.length != 4) {
                System.out.println("Invalid data format: " + str);
                continue;
            }

            userID = tokens[0];
            transactionDate = LocalDate.parse(tokens[1]);
            transaction = tokens[3];
            due = tokens[4];
            tr.add(new Transaction(userID, transactionDate, transaction, due));
        }

        TableView.setItems(tr);
        userIDColumnTableView.setCellValueFactory(new PropertyValueFactory<>("userID"));
        dateColumnTableView.setCellValueFactory(new PropertyValueFactory<>("transactionDatepicker"));
        transactionColumnTableView.setCellValueFactory(new PropertyValueFactory<>("transaction"));
        dueTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("due"));

        return tr;
    }

}
