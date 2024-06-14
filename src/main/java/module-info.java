module com.frankyrayms.snowflakesdl {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.frankyrayms.snowflakesdl to javafx.fxml;
    exports com.frankyrayms.snowflakesdl;
}
