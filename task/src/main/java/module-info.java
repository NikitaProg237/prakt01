module ru.tolmazanov.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.tolmazanov.task to javafx.fxml;
    exports ru.tolmazanov.task;
}