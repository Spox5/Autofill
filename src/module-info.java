module Autofill.test {

    requires javafx.fxml;
    requires javafx.controls;
    //opens sample to javafx.fxml;

    requires controlsfx;
    opens sample to javafx.graphics, javafx.fxml;
}