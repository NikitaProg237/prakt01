package ru.tolmazanov.task3;

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
        int N = Integer.parseInt(aTextField.getText().toString());
        int sum = 0;

        for (int i = N; i <= 2 * N; i++) {
            sum += i * i;
            result.setText("N="+sum);
        }
    }
}