package com.example.own_lab;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class RegistrationPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text registr;

    @FXML
    private AnchorPane enter;

    @FXML
    void initialize() {
        assert registr != null : "fx:id=\"registr\" was not injected: check your FXML file 'registration_page.fxml'.";
        assert enter != null : "fx:id=\"enter\" was not injected: check your FXML file 'registration_page.fxml'.";

    }
}
