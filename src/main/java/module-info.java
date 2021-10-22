module com.example.notefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notefx to javafx.fxml;
    exports com.example.notefx;
}