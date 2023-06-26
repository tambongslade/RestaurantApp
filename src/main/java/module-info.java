module com.example.st_stephen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.st_stephen to javafx.fxml;
    exports com.example.st_stephen;
}