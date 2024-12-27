package ru.tolmazanov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Rad;

    @FXML
    private TextField nHay;

    @FXML
    private Label result;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int R = Integer.parseInt(Rad.getText());
        int N = Integer.parseInt(nHay.getText());
        switch (N) {
            case 1:
                result.setText("R="+ R);
                break;
            case 2:
                result.setText("D="+2 * R);
                break;
            case 3:
                result.setText("L="+2 *Math.PI * R);
                break;
            case 4:
                result.setText("S="+Math.PI * R);
                break;
            default:
                result.setText("Ошибка!!!");
        }

    }

}
