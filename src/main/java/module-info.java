module org.openfx.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

    opens org.openfx.hellofx to javafx.fxml;
    exports org.openfx.hellofx;
}
