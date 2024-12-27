module ru.tolmazanov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task1 to javafx.fxml;
    exports ru.tolmazanov.task1;
}