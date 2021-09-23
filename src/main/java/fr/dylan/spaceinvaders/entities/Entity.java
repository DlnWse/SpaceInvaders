package fr.dylan.spaceinvaders.entities;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Entity extends Rectangle {

    protected Image img;
    protected ImagePattern imgPattern;

    public Entity(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public ImagePattern getImgPattern() {
        return imgPattern;
    }

    public void setImgPattern(ImagePattern imgPattern) {
        this.imgPattern = imgPattern;
    }
}
