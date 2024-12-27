module ru.tolmazanov.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task4 to javafx.fxml;
    exports ru.tolmazanov.task4;
}