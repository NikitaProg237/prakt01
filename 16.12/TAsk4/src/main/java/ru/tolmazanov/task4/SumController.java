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
        float a=Float.parseFloat(aTextField.getText().toString());
        float l=Float.parseFloat(lTextField1.getText().toString());
        double L= 1 + 24.86 * (Math.pow(10,-2));
        result.setText("D="+((L+Math.sin(l*a))/(2+Math.cos(Math.pow(a,2)))+a-Math.pow(10,a)));
    }

}
