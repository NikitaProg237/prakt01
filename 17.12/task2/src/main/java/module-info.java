module ru.tolmazanov.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task2 to javafx.fxml;
    exports ru.tolmazanov.task2;
}