package com.group5.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField inputField;

    @FXML
    private Button submitButton;

    @FXML
    private Label resultLabel;

    private Model model = new Model();

    @FXML
    private void initialize() {
        submitButton.setOnAction(event -> handleSubmitButtonAction());
    }

    private void handleSubmitButtonAction() {
        String input = inputField.getText();
        String result = model.processInput(input);
        resultLabel.setText(result);
    }
}
