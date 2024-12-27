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
       int k = Integer.getInteger(aTextField.getText().toString());
            int n=(k+5)%7+1;
            result.setText("День недели:"+n);
    }

}
