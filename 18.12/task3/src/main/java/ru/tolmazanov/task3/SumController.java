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
    private TextField bTextField;

    @FXML
    private TextField cTextField1;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A = Float.parseFloat(aTextField.getText().toString());
        float B = Float.parseFloat(bTextField.getText().toString());
        float C = Float.parseFloat(cTextField1.getText().toString());
        if ((A < B && B < C) || (A > B && B > C)) {
            A *= 2;
            B *= 2;
            C *= 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }
        result.setText("Новые значения переменных:" + " A = " + A + " B = " + B + " C = " + C);
    }
}


