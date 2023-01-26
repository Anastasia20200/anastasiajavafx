package com.example.own_lab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstPage {

    @FXML
    private Text registr;

    @FXML
    private Button rest;

    @FXML
    private Button log_in;

    @FXML
    private AnchorPane enter;

    @FXML
    void LogIn(ActionEvent event) {
        log_in.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reservation_page.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Bron");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void Rest(ActionEvent event) {
        rest.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second_page.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Bron");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

}

