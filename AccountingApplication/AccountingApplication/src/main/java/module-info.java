module org.example.accountingapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.accountingapplication to javafx.fxml;
    exports org.example.accountingapplication;
    opens Template to javafx.fxml;
    exports Template;
}