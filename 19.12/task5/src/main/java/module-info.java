module ru.tolmazanov.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task5 to javafx.fxml;
    exports ru.tolmazanov.task5;
}