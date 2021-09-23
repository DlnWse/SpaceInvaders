package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Constants;
import fr.dylan.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;

public class Ship extends Entity{

    private boolean shipIsShooting;

    public Ship(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern((new ImagePattern(Images.SHIP)));
        super.setFill(super.getImgPattern());
        this.shipIsShooting = false; // permet de savoir si le vaisseau tire
    }

    public double shipMoving(int shipDeltaX){
        if (shipDeltaX < 0){
            if(super.getX() > Constants.SHIP_LEFT_WINDOW_LIMIT){
                super.setX(super.getX() + shipDeltaX);
            }
        } else if (shipDeltaX > 0) {
            if(super.getX() < Constants.SHIP_RIGHT_WINDOW_LIMIT){
                super.setX(super.getX() + shipDeltaX);
            }
        }

        return super.getX();
    }

    public boolean isShipIsShooting() {
        return shipIsShooting;
    }

    public void setShipIsShooting(boolean shipIsShooting) {
        this.shipIsShooting = shipIsShooting;
    }
}
