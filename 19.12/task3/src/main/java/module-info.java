module ru.tolmazanov.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task3 to javafx.fxml;
    exports ru.tolmazanov.task3;
}