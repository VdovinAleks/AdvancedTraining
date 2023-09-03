package com.example.myfirstapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Зачем ты тыкаешь на меня ? :(");
    }
    @FXML
    protected void on2HelloButtonClick() {
        welcomeText.setText("О даааа!");
    }

}