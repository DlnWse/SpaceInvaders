package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Images;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Explosion {

    private static final Group explosion = new Group();

    public Explosion() {}

    public static Group explode() {

        final ImageView ex1 = new ImageView(Images.EX1);
        ex1.setFitWidth(50);
        ex1.setFitHeight(50);
        final ImageView ex2 = new ImageView(Images.EX2);
        ex2.setFitWidth(50);
        ex2.setFitHeight(50);
        final ImageView ex3 = new ImageView(Images.EX3);
        ex3.setFitWidth(50);
        ex3.setFitHeight(50);
        final ImageView ex4 = new ImageView(Images.EX4);
        ex4.setFitWidth(50);
        ex4.setFitHeight(50);
        final ImageView ex5 = new ImageView(Images.EX5);
        ex5.setFitWidth(50);
        ex5.setFitHeight(50);
        final ImageView ex6 = new ImageView(Images.EX6);
        ex6.setFitWidth(50);
        ex6.setFitHeight(50);
        final ImageView ex7 = new ImageView(Images.EX7);
        ex7.setFitWidth(50);
        ex7.setFitHeight(50);

        KeyFrame kf1 = new KeyFrame(Duration.millis(80), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex1);
            }
        });
        KeyFrame kf2 = new KeyFrame(Duration.millis(160), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex2);
            }
        });
        KeyFrame kf3 = new KeyFrame(Duration.millis(240), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex3);
            }
        });
        KeyFrame kf4 = new KeyFrame(Duration.millis(320), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex4);
            }
        });
        KeyFrame kf5 = new KeyFrame(Duration.millis(400), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex5);
            }
        });
        KeyFrame kf6 = new KeyFrame(Duration.millis(480), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex6);
            }
        });
        KeyFrame kf7 = new KeyFrame(Duration.millis(560), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosion.getChildren().setAll(ex7);
            }
        });

        Timeline timeline = new Timeline();
        //timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7);
        timeline.play();

        return explosion;
    }
}
