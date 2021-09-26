package fr.dylan.spaceinvaders.entities;

import fr.dylan.spaceinvaders.utils.Images;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Explosion {

    private static final Group explosionAlienShoot = new Group();
    private static final Group explosionAlien = new Group();
    private static final Group explosionShip = new Group();

    public Explosion() {}

    public static Group explosionAlienShoot() {
        final ImageView ex1 = new ImageView(Images.ALIEN_SHOOT_EX1);
        ex1.setFitWidth(30);
        ex1.setFitHeight(30);
        final ImageView ex2 = new ImageView(Images.ALIEN_SHOOT_EX2);
        ex2.setFitWidth(30);
        ex2.setFitHeight(30);
        final ImageView ex3 = new ImageView(Images.ALIEN_SHOOT_EX3);
        ex3.setFitWidth(30);
        ex3.setFitHeight(30);
        final ImageView ex4 = new ImageView(Images.ALIEN_SHOOT_EX4);
        ex4.setFitWidth(30);
        ex4.setFitHeight(30);
        final ImageView ex5 = new ImageView(Images.ALIEN_SHOOT_EX5);
        ex5.setFitWidth(30);
        ex5.setFitHeight(30);
        final ImageView ex6 = new ImageView(Images.ALIEN_SHOOT_EX6);
        ex6.setFitWidth(30);
        ex6.setFitHeight(30);
        final ImageView ex7 = new ImageView(Images.ALIEN_SHOOT_EX7);
        ex7.setFitWidth(30);
        ex7.setFitHeight(30);

        KeyFrame kf1 = new KeyFrame(Duration.millis(80), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex1);
            }
        });
        KeyFrame kf2 = new KeyFrame(Duration.millis(160), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex2);
            }
        });
        KeyFrame kf3 = new KeyFrame(Duration.millis(240), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex3);
            }
        });
        KeyFrame kf4 = new KeyFrame(Duration.millis(320), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex4);
            }
        });
        KeyFrame kf5 = new KeyFrame(Duration.millis(400), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex5);
            }
        });
        KeyFrame kf6 = new KeyFrame(Duration.millis(480), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex6);
            }
        });
        KeyFrame kf7 = new KeyFrame(Duration.millis(560), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlienShoot.getChildren().setAll(ex7);
            }
        });

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7);
        timeline.play();

        return explosionAlienShoot;
    }

    public static Group explosionAlien() {
        final ImageView ex1 = new ImageView(Images.ALIEN_EX1);
        ex1.setFitWidth(50);
        ex1.setFitHeight(50);
        final ImageView ex2 = new ImageView(Images.ALIEN_EX2);
        ex2.setFitWidth(50);
        ex2.setFitHeight(50);
        final ImageView ex3 = new ImageView(Images.ALIEN_EX3);
        ex3.setFitWidth(50);
        ex3.setFitHeight(50);
        final ImageView ex4 = new ImageView(Images.ALIEN_EX4);
        ex4.setFitWidth(50);
        ex4.setFitHeight(50);
        final ImageView ex5 = new ImageView(Images.ALIEN_EX5);
        ex5.setFitWidth(50);
        ex5.setFitHeight(50);
        final ImageView ex6 = new ImageView(Images.ALIEN_EX6);
        ex6.setFitWidth(50);
        ex6.setFitHeight(50);
        final ImageView ex7 = new ImageView(Images.ALIEN_EX7);
        ex7.setFitWidth(50);
        ex7.setFitHeight(50);
        final ImageView ex8 = new ImageView(Images.ALIEN_EX8);
        ex8.setFitWidth(50);
        ex8.setFitHeight(50);

        KeyFrame kf1 = new KeyFrame(Duration.millis(80), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex1);
            }
        });
        KeyFrame kf2 = new KeyFrame(Duration.millis(160), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex2);
            }
        });
        KeyFrame kf3 = new KeyFrame(Duration.millis(240), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex3);
            }
        });
        KeyFrame kf4 = new KeyFrame(Duration.millis(320), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex4);
            }
        });
        KeyFrame kf5 = new KeyFrame(Duration.millis(400), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex5);
            }
        });
        KeyFrame kf6 = new KeyFrame(Duration.millis(480), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex6);
            }
        });
        KeyFrame kf7 = new KeyFrame(Duration.millis(560), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex7);
            }
        });
        KeyFrame kf8 = new KeyFrame(Duration.millis(640), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionAlien.getChildren().setAll(ex8);
            }
        });

        Timeline timeline = new Timeline();
        //timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7, kf8);
        timeline.play();

        return explosionAlien;
    }

    public static Group explosionShip() {
        final ImageView ex1 = new ImageView(Images.SHIP_EX1);
        ex1.setFitWidth(60);
        ex1.setFitHeight(80);
        final ImageView ex2 = new ImageView(Images.SHIP_EX2);
        ex2.setFitWidth(60);
        ex2.setFitHeight(80);
        final ImageView ex3 = new ImageView(Images.SHIP_EX3);
        ex3.setFitWidth(60);
        ex3.setFitHeight(80);
        final ImageView ex4 = new ImageView(Images.SHIP_EX4);
        ex4.setFitWidth(60);
        ex4.setFitHeight(80);
        final ImageView ex5 = new ImageView(Images.SHIP_EX5);
        ex5.setFitWidth(60);
        ex5.setFitHeight(80);
        final ImageView ex6 = new ImageView(Images.SHIP_EX6);
        ex6.setFitWidth(60);
        ex6.setFitHeight(80);
        final ImageView ex7 = new ImageView(Images.SHIP_EX7);
        ex7.setFitWidth(60);
        ex7.setFitHeight(80);
        final ImageView ex8 = new ImageView(Images.SHIP_EX8);
        ex8.setFitWidth(60);
        ex8.setFitHeight(80);
        final ImageView ex9 = new ImageView(Images.SHIP_EX9);
        ex9.setFitWidth(60);
        ex9.setFitHeight(80);
        final ImageView ex10 = new ImageView(Images.SHIP_EX10);
        ex10.setFitWidth(60);
        ex10.setFitHeight(80);
        final ImageView ex11 = new ImageView(Images.SHIP_EX11);
        ex11.setFitWidth(60);
        ex11.setFitHeight(80);

        KeyFrame kf1 = new KeyFrame(Duration.millis(120), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex1);
            }
        });
        KeyFrame kf2 = new KeyFrame(Duration.millis(240), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex2);
            }
        });
        KeyFrame kf3 = new KeyFrame(Duration.millis(360), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex3);
            }
        });
        KeyFrame kf4 = new KeyFrame(Duration.millis(480), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex4);
            }
        });
        KeyFrame kf5 = new KeyFrame(Duration.millis(600), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex5);
            }
        });
        KeyFrame kf6 = new KeyFrame(Duration.millis(720), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex6);
            }
        });
        KeyFrame kf7 = new KeyFrame(Duration.millis(840), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex7);
            }
        });
        KeyFrame kf8 = new KeyFrame(Duration.millis(960), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex8);
            }
        });
        KeyFrame kf9 = new KeyFrame(Duration.millis(1080), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex9);
            }
        });
        KeyFrame kf10 = new KeyFrame(Duration.millis(1200), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex10);
            }
        });
        KeyFrame kf11 = new KeyFrame(Duration.millis(1320), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                explosionShip.getChildren().setAll(ex11);
            }
        });

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7, kf8, kf9, kf10, kf11);
        timeline.play();

        return explosionShip;
    }

}
