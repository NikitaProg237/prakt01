package ru.tolmazanov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Aewrtyu;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
float a =Float.parseFloat(Aewrtyu.getText().toString());
result.setText("Единица: " + a % 10 + "Десятки"+(a / 10) % 10);
    }

}
