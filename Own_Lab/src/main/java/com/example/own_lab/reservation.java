package com.example.own_lab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class reservation {

    @FXML
    private Button next;

    @FXML
    private Button bron1;

    @FXML
    private Button zrych;

    @FXML
    private Button dodatku;

    @FXML
    void bron1(ActionEvent event) {
        bron1.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reservation_page.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Reserv");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void dodatku(ActionEvent event) {
        dodatku.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_page.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void zrych(ActionEvent event) {
        zrych.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("comfort_page.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Comfort");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void Next(ActionEvent event) {
        next.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_page.fxml"));
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

