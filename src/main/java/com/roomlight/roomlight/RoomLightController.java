package com.roomlight.roomlight;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RoomLightController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}