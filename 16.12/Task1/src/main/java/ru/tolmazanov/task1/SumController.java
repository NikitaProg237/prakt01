package ru.tolmazanov.task1;

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
        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        result.setText("S="+Math.sqrt(a*b));

    }

}
