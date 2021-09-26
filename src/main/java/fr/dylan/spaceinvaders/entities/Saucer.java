package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Constants;
import fr.dylan.spaceinvaders.utils.Images;
import fr.dylan.spaceinvaders.utils.Sounds;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.ImagePattern;

public class Saucer extends Entity {

    private final AudioClip saucerPassingSound = new AudioClip(Sounds.SAUCER_PASSING);
    private boolean isDead;

    public Saucer(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SAUCER));
        super.setFill(super.getImgPattern());
        this.saucerPassingSound.setVolume(0.01);
        this.saucerPassingSound.play();
        this.isDead = false;
    }

    public void saucerMoving(int deltaX) {
        if (super.getX() > -Constants.SAUCER_WIDTH &&
                super.getX() < Constants.WINDOW_WIDTH + 1) {
            super.setX(super.getX() - deltaX);
        } else {
            // le son de la soucoupe est coupé quand elle est sortie du board ou détruite
            this.saucerPassingSound.stop();
        }
    }

    // Getters & Setters
    public AudioClip getSaucerPassingSound() {
        return saucerPassingSound;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
