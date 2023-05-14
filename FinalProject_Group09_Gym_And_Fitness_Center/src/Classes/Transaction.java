/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sarah Mahbub
 */
public class Transaction implements Serializable {

    private String userID, transaction, due;
    private LocalDate transactionDatepicker;

    public Transaction(String userID, LocalDate transactionDate, String transaction, String due) {
        this.userID = userID;
        this.transactionDatepicker = transactionDate;
        this.transaction = transaction;
        this.due = due;
        addTransactionTxt();
    }

    public Transaction() {

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public LocalDate getTransactionDatepicker() {
        return transactionDatepicker;
    }

    public void setTransactionDatepicker(LocalDate transactionDatepicker) {
        this.transactionDatepicker = transactionDatepicker;
    }

    public void display() {
        System.out.println("userID=" + userID + ", Transaction Date =" + transactionDatepicker + ", Transaction =" + transaction + ",Due =" + due);
    }

    public static ArrayList LoadTransaction(String UserFile) {
        String f = UserFile + "_Transaction.txt";

        ArrayList<String> transactList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(f))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                /* String[] fields = line.split("//");
            if (fields.length != 4) {
                System.out.println("Invalid data format: " + line);
                continue;
            }
            String userID = fields[0];
            String transactionDate = fields[1];
            int age = Integer.parseInt(fields[2]);
            String city = fields[3];
            members.add(new MemberDetails(name, email, age, city));*/
                transactList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + f);
        }
        return transactList;
    }

    public void addTransactionTxt() {
        String user = this.userID;
        File f = null;
        FileWriter fw = null;
        try {
            f = new File(user + "_Transaction.txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }

            fw.write(this.userID + "//" + this.transactionDatepicker + "//" + this.transaction + "//" + this.due + "\n");
            System.out.println("File Write addTransactionTxt");

        } catch (IOException ex) {
            //                   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erorr In addTransactionTxt");

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                //   Logger.getLogger(Submit_NoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
