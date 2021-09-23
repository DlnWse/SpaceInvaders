package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Constants;
import fr.dylan.spaceinvaders.utils.Images;
import fr.dylan.spaceinvaders.utils.Sounds;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.ImagePattern;

public class Saucer extends Entity{
    private AudioClip saucerPassingSound = new AudioClip(Sounds.SAUCER_PASSING);
    private boolean isOnScreen;


    public Saucer(double x, double y, double width, double height) {
        super(x, y, width, height);
        super.setImgPattern(new ImagePattern(Images.SAUCER));
        super.setFill(super.getImgPattern());
        this.saucerPassingSound.setVolume(0.2);
        this.saucerPassingSound.play();
        this.isOnScreen = false;

    }

    public void saucerMoving(int deltaX){
        if (super.getX() > 0 - Constants.SAUCER_WIDTH && super.getX() <= Constants.WINDOW_WIDTH){
            super.setX(super.getX() - deltaX);
            isOnScreen = true;
        }else {
            isOnScreen = false;
            this.saucerPassingSound.stop();
        }
    }

}
