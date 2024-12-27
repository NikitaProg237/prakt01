package ru.tolmazanov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ccTextField;

    @FXML
    private TextField nnTextField;

    @FXML
    private Label result;

    @FXML
    private Label result1;

    @FXML
    private Button sButton;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        int CC = Integer.parseInt(ccTextField.getText());
        switch (CC) {
            case 1:
                result.setText("Север");
                break;
            case 2:
                result.setText("Запад");
                break;
            case 3:
                result.setText("ЮГ");
                break;
            case 4:
                result.setText("Восток");
                break;
            default:
                result.setText("Ошибка!!!");
        }
        int NN = Integer.parseInt(nnTextField.getText());
        switch (NN) {
            case 0:
                result1.setText("продолжать движение");
                break;
            case 1:
                result1.setText("поворот налево");
                break;
            case -1:
                result1.setText("поворот направо");
                break;
            default:
                result1.setText("Ошибка!!!");
        }

    }
}