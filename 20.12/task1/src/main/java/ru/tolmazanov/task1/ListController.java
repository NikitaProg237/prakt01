package ru.tolmazanov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.List;

public class ListController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button closeButton;

    @FXML
    private GridPane dataLisrView;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button okButton;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int max = 0;
        boolean foundZero = false;

        for (int number : data) {
            if (number == 0) {
                foundZero = true;
                break;
            }
            if (number % 6 == 0 && number % 10 ==6) {
                max += number;

            }
        }
        if (max != 0)
            answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Сумма чисел, кратных 8 и оканчивающихся на 6:" + max);
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());

            dataListView.getItems().add(x);
            numberTextField.clear();
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Пожалуйста, введите целое число");
            alert.show();
        }
    }


    @FXML
    void CloseButtonOnAction(ActionEvent event) {
        dataListView.getItems().clear();
        answerLabel.setText("");
    }

}
