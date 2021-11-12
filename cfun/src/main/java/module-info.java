module cfun {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires java.desktop;

    opens org.openfx.cfun to javafx.fxml;
    exports org.openfx.cfun;
}
