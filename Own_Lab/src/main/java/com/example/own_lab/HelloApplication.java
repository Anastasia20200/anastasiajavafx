package com.example.own_lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader second_page = new FXMLLoader(HelloApplication.class.getResource("first_page.fxml"));
        Scene scene1 = new Scene(second_page.load(), 320, 240);
        stage.setTitle("hotel");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}