package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Constants;
import fr.dylan.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;

public class ShipShot extends Entity{
    public ShipShot(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SHIP_SHOT));
        super.setFill(super.getImgPattern());
    }

    public static void shipShotPlacement(ShipShot shipShot,Ship ship){
        shipShot.setX(ship.getX() + 15);
        shipShot.setY(ship.getY());
    }
}
