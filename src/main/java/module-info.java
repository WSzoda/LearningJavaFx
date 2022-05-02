module com.example.learing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learing to javafx.fxml;
    exports com.example.learing;
}