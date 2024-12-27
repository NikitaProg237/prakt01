package ru.tolmazanov.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private TextField nTextField1;

    @FXML
    private Label result;

    @FXML
    private Label result1;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        int K = Integer.parseInt(kTextField.getText().toString());
        int Sum = Integer.parseInt(nTextField1.getText().toString());
        while (Sum < N) {
            K++;
            Sum += K;
        }
        result.setText("Наименьшее K: " + K);
        result1.setText("Сумма 1 + 2 + ... + K: " + Sum);

    }

}
