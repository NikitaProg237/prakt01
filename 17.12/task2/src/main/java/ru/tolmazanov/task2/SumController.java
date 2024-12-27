package ru.tolmazanov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        result.setText("S=" + a / 10 + a % 10);

    }
}
