package fr.dylan.spaceinvaders.utils;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public abstract class Images {

    private final static String PATH = "File:./src/main/resources/fr/dylan/spaceinvaders/images/";

    public final static Image SHIP = new Image(PATH + "vaisseau.png");
    public final static Image SHIP_SHOT = new Image(PATH + "ship1Shoot.png");

    public final static Image ALIEN_SHOT = new Image(PATH + "aliensShoot2.png");

    private final static Image IMG_BRICK1 = new Image(PATH + "bricks/brick1.png");
    private final static Image IMG_BRICK2 = new Image(PATH + "bricks/brick2.png");
    private final static Image IMG_BRICK3 = new Image(PATH + "bricks/brick3.png");
    private final static Image IMG_BRICK4 = new Image(PATH + "bricks/brick4.png");
    private final static Image IMG_BRICK5 = new Image(PATH + "bricks/brick5.png");
    private final static Image IMG_BRICK6 = new Image(PATH + "bricks/brick6.png");
    private final static Image IMG_BRICK7 = new Image(PATH + "bricks/brick7.png");

    public final static ImagePattern BRICK1 = new ImagePattern(IMG_BRICK1);
    public final static ImagePattern BRICK2 = new ImagePattern(IMG_BRICK2);
    public final static ImagePattern BRICK3 = new ImagePattern(IMG_BRICK3);
    public final static ImagePattern BRICK4 = new ImagePattern(IMG_BRICK4);
    public final static ImagePattern BRICK5 = new ImagePattern(IMG_BRICK5);
    public final static ImagePattern BRICK6 = new ImagePattern(IMG_BRICK6);
    public final static ImagePattern BRICK7 = new ImagePattern(IMG_BRICK7);

    public final static Image ALIENHIGH1 = new Image(PATH + "alienHigh1.png");
    public final static Image ALIENHIGH2 = new Image(PATH + "alienHigh2.png");
    public final static Image ALIENMIDDLE1 = new Image(PATH + "alienMiddle1.png");
    public final static Image ALIENMIDDLE2 = new Image(PATH + "alienMiddle2.png");
    public final static Image ALIENBOTTOM1 = new Image(PATH + "alienBottom1.png");
    public final static Image ALIENBOTTOM2 = new Image(PATH + "alienBottom2.png");

    public final static Image SAUCER = new Image(PATH + "saucer.png");
    public final static Image SAUCER_100 = new Image(PATH + "saucer100.png");

    /*************************** EXPLOSIONS IMAGES ***********************************/
    public final static Image ALIEN_EX1 = new Image(PATH + "explosionAlien/ExAlien1.png");
    public final static Image ALIEN_EX2 = new Image(PATH + "explosionAlien/ExAlien2.png");
    public final static Image ALIEN_EX3 = new Image(PATH + "explosionAlien/ExAlien3.png");
    public final static Image ALIEN_EX4 = new Image(PATH + "explosionAlien/ExAlien4.png");
    public final static Image ALIEN_EX5 = new Image(PATH + "explosionAlien/ExAlien5.png");
    public final static Image ALIEN_EX6 = new Image(PATH + "explosionAlien/ExAlien6.png");
    public final static Image ALIEN_EX7 = new Image(PATH + "explosionAlien/ExAlien7.png");
    public final static Image ALIEN_EX8 = new Image(PATH + "explosionAlien/ExAlien8.png");

    public final static Image ALIEN_SHOOT_EX1 = new Image(PATH + "explosionAlienShoot/ExAlienShoot1.png");
    public final static Image ALIEN_SHOOT_EX2 = new Image(PATH + "explosionAlienShoot/ExAlienShoot2.png");
    public final static Image ALIEN_SHOOT_EX3 = new Image(PATH + "explosionAlienShoot/ExAlienShoot3.png");
    public final static Image ALIEN_SHOOT_EX4 = new Image(PATH + "explosionAlienShoot/ExAlienShoot4.png");
    public final static Image ALIEN_SHOOT_EX5 = new Image(PATH + "explosionAlienShoot/ExAlienShoot5.png");
    public final static Image ALIEN_SHOOT_EX6 = new Image(PATH + "explosionAlienShoot/ExAlienShoot6.png");
    public final static Image ALIEN_SHOOT_EX7 = new Image(PATH + "explosionAlienShoot/ExAlienShoot7.png");

    public final static Image SHIP_EX1 = new Image(PATH + "explosionShip/ExShip1.png");
    public final static Image SHIP_EX2 = new Image(PATH + "explosionShip/ExShip2.png");
    public final static Image SHIP_EX3 = new Image(PATH + "explosionShip/ExShip3.png");
    public final static Image SHIP_EX4 = new Image(PATH + "explosionShip/ExShip4.png");
    public final static Image SHIP_EX5 = new Image(PATH + "explosionShip/ExShip5.png");
    public final static Image SHIP_EX6 = new Image(PATH + "explosionShip/ExShip6.png");
    public final static Image SHIP_EX7 = new Image(PATH + "explosionShip/ExShip7.png");
    public final static Image SHIP_EX8 = new Image(PATH + "explosionShip/ExShip8.png");
    public final static Image SHIP_EX9 = new Image(PATH + "explosionShip/ExShip9.png");
    public final static Image SHIP_EX10 = new Image(PATH + "explosionShip/ExShip10.png");
    public final static Image SHIP_EX11 = new Image(PATH + "explosionShip/ExShip11.png");

}