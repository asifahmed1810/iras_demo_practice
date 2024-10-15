module com.addsubtract.iras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.addsubtract.iras to javafx.fxml;
    exports com.addsubtract.iras;
}