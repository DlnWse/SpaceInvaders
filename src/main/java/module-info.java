module fr.dylan.spaceinvaders {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.media;

    opens fr.dylan.spaceinvaders to javafx.fxml;
    exports fr.dylan.spaceinvaders;
}