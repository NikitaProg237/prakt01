package ru.tolmazanov.task.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static ru.tolmazanov.task.util.Manager.showSecondScene;

public class Tri {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private TextField emailcheck;

    @FXML
    private TextField passcheck;

    @FXML
    private Button login;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void login(ActionEvent event) {
        String emailInput = emailcheck.getText().trim();
        String passwordInput = passcheck.getText().trim();

        String registeredEmail = ru.tolmazanov.task.controller.q.getRegisteredEmail();
        String registeredPassword = ru.tolmazanov.task.controller.q.getRegisteredPassword();

        if (registeredEmail == null || registeredPassword == null) {

            return;
        }

        if (emailInput.equals(registeredEmail) && passwordInput.equals(registeredPassword)) {

            showSecondScene("f.fxml", "Marathon Skills 2016 - Register as a runner");

        }
    }
}
