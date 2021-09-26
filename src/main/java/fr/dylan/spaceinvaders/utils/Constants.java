package fr.dylan.spaceinvaders.utils;

public abstract class Constants {

    /********************* STRING *********************/
    public static final String WIN = "YOU WIN !!!";
    public static final String LOOSE = "GAME OVER";

    /******************** WINDOW ********************/
    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int WINDOW_MARGIN = 50;

    /********************* SHIP *********************/
    public static final int SHIP_WIDTH = 39;
    public static final int SHIP_HEIGHT = 24;

    public static final int X_POS_INIT_SHIP = (WINDOW_WIDTH - SHIP_WIDTH) / 2;
    public static final int Y_POS_INIT_SHIP = 505;
    public static final int SHIP_DELTAX = 5;

    public static final int SHIP_LEFT_WINDOW_LIMIT = 30;
    public static final int SHIP_RIGHT_WINDOW_LIMIT = 530;

    /******************** SHIP SHOT ********************/
    public static final int SHIP_SHOT_WIDTH = 10;
    public static final int SHIP_SHOT_HEIGHT = 10;
    public static final int SHIP_SHOT_DELTAY = 10;

    /************************ BRICK **********************/
    public static final int BRICK_WIDTH = 10;
    public static final int BRICK_HEIGHT = 10;
    public static final int BRICK_POINTS = 5;

    /*********************** ALIEN **********************/
    public static final int ALIEN_WIDTH = 32;
    public static final int ALIEN_HEIGHT = 24;

    public static final int X_POS_INIT_ALIEN = 40 + WINDOW_MARGIN;
    public static final int Y_POS_INIT_ALIEN = 50;
    public static final int GAP_LINES_ALIENS = 10;
    public static final int GAP_COLUMNS_ALIENS = 10;

    public static final int ALIEN_DELTAX = 7; // 7
    public static final int ALIEN_DELTAY = 20; // 20
    public static final int ALIEN_SPEED = 1;
    public static final int ALIEN_POINTS = 20;

    /******************* ALIEN SHOT ***********************/
    public static final int ALIEN_SHOT_WIDTH = 10;
    public static final int ALIEN_SHOT_HEIGHT = 10;
    public static final int ALIEN_SHOT_DELTAY = 4;
    public static final int ALIEN_SHOT_POINTS = 50;

    /********************** SAUCER ***********************/
    public static final int X_POS_INIT_SAUCER = WINDOW_WIDTH;
    public static final int Y_POS_INIT_SAUCER = 15;
    public static final int SAUCER_WIDTH = 42;
    public static final int SAUCER_HEIGHT = 22;
    public static final int SAUCER_DELTAX = 2;

    /********************* SAUCER SCORE RECTANGLE ****************/
    public static final int X_POS_INIT_SAUCER_SCORE = WINDOW_WIDTH;
    public static final int Y_POS_INIT_SAUCER_SCORE = WINDOW_HEIGHT;
    public static final int SAUCER_SCORE_WIDTH = 42;
    public static final int SAUCER_SCORE_HEIGHT = 22;
    public static final int SAUCER_SCORE_POINTS = 100;

}


