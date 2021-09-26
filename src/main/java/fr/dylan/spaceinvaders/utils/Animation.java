package fr.dylan.spaceinvaders.utils;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Animation {

    public static void animateLogoSpaceInvaders(ImageView imgLogo, double fromY, double toY,
                                                double translationDelay, double fromAlpha,
                                                double toAlpha, double alphaDelay) {
        TranslateTransition animation = new TranslateTransition(Duration.millis(translationDelay), imgLogo);
        animation.setFromY(fromY);
        animation.setToY(toY);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.play();

        FadeTransition fade = new FadeTransition(Duration.millis(alphaDelay));
        fade.setNode(imgLogo);
        fade.setFromValue(fromAlpha);
        fade.setToValue(toAlpha);
        fade.play();
    }

}
