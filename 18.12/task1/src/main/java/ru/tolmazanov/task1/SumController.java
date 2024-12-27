package ru.tolmazanov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
float k= Float.parseFloat(kTextField.getText().toString());
        float A = k / 100;
        float B = k % 10;
        if (A > B) {
            result.setText("Первая цифра больше последней.");
        } else if (A < B) {
            result.setText("Последняя цифра больше первой.");
        } else {
            result.setText("Первая и последняя цифры равны.");
        }
    }

}
