package com.example.own_lab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class secondpage {

    @FXML
    private Button registr;

    @FXML
    private TextField password;

    @FXML
    private TextField First_name;

    @FXML
    private Button Log;

    @FXML
    private TextField last_name;

    @FXML
    private TextField login;

    @FXML
    void registration_name(ActionEvent event) {

    }

    @FXML
    void registratin_last_name(ActionEvent event) {

    }

    @FXML
    void registration_login(ActionEvent event) {

    }

    @FXML
    void registration_password(ActionEvent event) {

    }

    @FXML
    void Registration(ActionEvent event) {

    }

    @FXML
    void Log(ActionEvent event) {
        Log.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("first_page.fxml"));
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
