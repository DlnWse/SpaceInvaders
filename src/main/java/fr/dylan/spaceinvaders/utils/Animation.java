package fr.dylan.spaceinvaders.utils;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Animation {
    public static void animateLogoSpaceInvaders(ImageView imgLogo, double fromY, double toY, double delay, double fromAlpha, double toAlpha, double alphaDuration){
        TranslateTransition animation = new TranslateTransition(Duration.millis(delay), imgLogo);
        animation.setFromY(fromY);
        animation.setToY(toY);
        animation.setInterpolator(Interpolator.EASE_IN);
        animation.play();

        FadeTransition fade = new FadeTransition(Duration.millis(alphaDuration));
        fade.setNode(imgLogo);
        fade.setFromValue(fromAlpha);
        fade.setToValue(toAlpha);
        fade.play();


    }
}
