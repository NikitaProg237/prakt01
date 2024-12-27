package ru.tolmazanov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField lTextField1;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText().toString());
        int N = Integer.parseInt(lTextField1.getText().toString());

        double sum = 1;
        double term = 1;
        for (int i = 1; i <= N; i++) {
            term *= A;
            sum += term;
            result.setText(" A=" + term);
        }
    }
}
