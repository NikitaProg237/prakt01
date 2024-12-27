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
    private TextField bTextField;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A=Float.parseFloat(aTextField.getText().toString());
        float B=Float.parseFloat(bTextField.getText().toString());
        if (A != B) {
            A = A + B;
            B = A;
        } else {
            A = 0;
            B = 0;
        }
        result.setText("Новые значения переменных:"+" A = " + A +" B = " + B);
    }

}
