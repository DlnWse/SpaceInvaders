package fr.dylan.spaceinvaders;

import fr.dylan.spaceinvaders.entities.*;
import fr.dylan.spaceinvaders.utils.*;
import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.*;

public class SpaceController {

        private Ship ship;
        private ShipShot shipShot;
        private AnimationTimer timer;
        private int shipDeltaX;
        private List<Brick> walls;
        private Alien[][] aliens;
        private long movingAliensCount;
        public static int speed = Constants.ALIEN_SPEED;
        private Group groupExplosion;
        private final IntegerProperty score = new SimpleIntegerProperty(0);
        private static boolean initStartButton;
        private static Random random =  new Random();
        private static LinkedList<AlienShot> alienShotList = new LinkedList<>();
        private Saucer saucer;
        private int saucerTime = 1;

        private static int count = 0;

        @FXML
        private Pane board;

        @FXML
        private Label lblEndGame,lblScore, lblLeftScore;

        @FXML
        private ImageView imgLogo;



        public SpaceController() {
                timer = new AnimationTimer() {
                        @Override
                        public void handle(long l) {
                                movingAliensCount++;
                                handleShip();
                                if (ship.isShipIsShooting()) {
                                        handleShipShot();
                                        shipShotCollisions();
                                        //saucerTime++;
                                }

                                if (movingAliensCount % (100 - (10L * speed)) == 0) {
                                        Alien.aliensMoving(aliens);
                                        aliensWallCollisions();
                                }

                                aliensShooting();
                                AlienShot.handleAliensShot(alienShotList, board);
                                collisions();
                                if (saucerTime % 400 == 0) {
                                        saucer = new Saucer(Constants.X_POS_INIT_SAUCER, Constants.Y_POS_INIT_SAUCER, Constants.SAUCER_WIDTH, Constants.SAUCER_HEIGHT);
                                        board.getChildren().add(saucer);
                                        saucerTime = 1;
                                } else if (saucer != null) {
                                        saucer.saucerMoving(Constants.SAUCER_DELTAX);
                                }
                                saucerTime++;
                                System.out.println(saucerTime);
                        }

                };
        }


        private void collisions(){
                shipShotCollisions();
                aliensShotCollisions();
        }

        private void aliensShotCollisions(){
                try {
                     for (Brick brick :  walls){
                             for (AlienShot alienShot  : alienShotList){
                                     if( brick.getBoundsInParent().intersects(alienShot.getBoundsInParent())){
                                             walls.removeIf(thisBrick -> thisBrick.equals(brick));
                                             alienShotList.removeIf(thisAlienShot -> thisAlienShot.equals(alienShot));
                                             board.getChildren().removeAll(brick);
                                             board.getChildren().removeAll(alienShot);
                                        Audio.playSound(Sounds.BRICK_DESTRUCTION);
                                     }
                             }
                     }
                }catch (ConcurrentModificationException e){
                        System.out.println("ALIEN SHOT -> BRICKS  Concurrent Exception Modification");
                }
        }

        private void aliensWallCollisions(){
                try {
                        for (Brick brick : walls){
                                for (Alien[]alienRow :aliens){
                                        for (Alien alien : alienRow){
                                                if (brick.getBoundsInParent().intersects(alien.getBoundsInParent())){
                                                        walls.removeIf(thisBrick -> thisBrick.equals(brick));
                                                        board.getChildren().remove(brick);
                                                }
                                        }
                                }
                        }

                }catch (ConcurrentModificationException e){
                        System.out.println("ALIEN -> WALL  Concurrent Exception Modification");
                }
        }

        public void initGame(){

                ship = new Ship(Constants.X_POS_INIT_SHIP, Constants.Y_POS_INIT_SHIP, Constants.SHIP_WIDTH, Constants.SHIP_HEIGHT);
                shipShot = new ShipShot(- Constants.SHIP_SHOT_WIDTH,- Constants.SHIP_SHOT_HEIGHT,Constants.SHIP_SHOT_WIDTH,Constants.SHIP_SHOT_HEIGHT);
                lblEndGame.setText("");
                walls = new LinkedList<>();
                aliens = new Alien[5][10];
                movingAliensCount = 0;
                alienShotList = new LinkedList<AlienShot>();

        }

        @FXML
        void onStartAction() {
                if (!initStartButton) {
                        Animation.animateLogoSpaceInvaders(imgLogo, 0, -500, 600, 1, 0, 400);
                        board.requestFocus();
                        initGame();
                        Initialisation.initShip(ship, board);
                        Initialisation.initShipShot(shipShot, board);
                        Initialisation.initWalls(80, 400, 80, walls, board);
                        Initialisation.initAliens(aliens, board);
                        lblScore.textProperty().bind(Bindings.convert(score));
                        lblScore.setVisible(true);
                        lblLeftScore.setVisible(true);
                        score.set(0);
                        timer.start();
                        initStartButton = true;




        //saucer = new Saucer(Constants.X_POS_INIT_SAUCER, Constants.Y_POS_INIT_SAUCER,Constants.SAUCER_WIDTH,Constants.SAUCER_HEIGHT);
                }
        }

        private void handleShip() {
                shipMoveHorizontal(shipDeltaX);
        }

        private void handleShipShot(){
                if (shipShot.getY() <= -20){
                        ship.setShipIsShooting(false);

                }else if (shipShot.getY() >= -20) {
                        shipShot.setY(shipShot.getY() - Constants.SHIP_SHOT_DELTAY);
                }
        }

        private void shipMoveHorizontal(int shipDeltaX) {
                ship.setX(ship.shipMoving(shipDeltaX));
        }



        @FXML
        public void onKeyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                        case LEFT:
                                shipDeltaX = -Constants.SHIP_DELTAX;
                                handleShip();
                                break;
                        case RIGHT:
                                shipDeltaX = Constants.SHIP_DELTAX;
                                handleShip();
                                break;
                        case SPACE:
                                if (!ship.isShipIsShooting()) {
                                        ship.setShipIsShooting(true);
                                        shipShot.shipShotPlacement(shipShot, ship);
                                        Audio.playSound(Sounds.SHIP_SHOT);
                                }
                                break;
                }
        }

        private void aliensShooting(){
                //Pour chaques invaders on determine aleatoirement si il tire

                for (Alien[] alienRow : aliens) {
                        for (Alien alien : alienRow) {
                                int shootProbability = 5000;
                                if (random.nextInt(shootProbability) == 50){
                                        AlienShot alienShot = new AlienShot(alien.getX() + Constants.ALIEN_WIDTH / 2, alien.getY() + Constants.ALIEN_HEIGHT, Constants.ALIEN_SHOT_WIDTH, Constants.ALIEN_SHOT_HEIGHT);
                                        alienShotList.add(alienShot);
                                        board.getChildren().add(alienShot);
                                }
                        }
                }
        }

        private void shipShotCollisions() {
                        // Collisions avec une Brick
                try {
                        for (Brick brick : walls) {
                                if (brick.getBoundsInParent().intersects(shipShot.getBoundsInParent())) {
                                        // On replace le tir hors du board
                                        shipShot.setX(-10);
                                        shipShot.setY(-10);
                                        // On réautorise à tirer en appuyant sur ESPACE
                                        ship.setShipIsShooting(false);
                                        // On retire la brick Brick du mur walls
                                        walls.removeIf(laBriqueEnQuestion -> laBriqueEnQuestion.equals(brick));
                                        board.getChildren().remove(brick);

                                        Audio.playSound(Sounds.BRICK_DESTRUCTION);
                                        // On met à jour le score avec la collision d'un tir sur une brick
                                        if (score.get() >= Constants.BRICK_POINTS) {
                                                score.set(score.get() - Constants.BRICK_POINTS);
                                        }
                                }
                        }
                } catch (ConcurrentModificationException e) {
                        System.out.println("Concurrent Exception Ship -> Brick");
                }
                for (Alien[] alienRow: aliens) {
                        for (Alien alien : alienRow) {
                                if (alien.getBoundsInParent().intersects(shipShot.getBoundsInParent())) {
                                        // On replace le tir hors du board
                                        shipShot.setX(-10);
                                        shipShot.setY(-10);
                                        // On réautorise à tirer en appuyant sur ESPACE
                                        ship.setShipIsShooting(false);
                                        // On instancie un nouveau Group : groupExplosion
                                        groupExplosion = new Group(Explosion.explode());
                                        groupExplosion.setLayoutX(alien.getX() - 10);
                                        groupExplosion.setLayoutY(alien.getY() - 10);
                                        board.getChildren().addAll(groupExplosion);
                                        // On sort l'alien du board
                                        alien.setX(100);
                                        alien.setY(-600);
                                        // On retire l'alien du board
                                        board.getChildren().remove(alien);
                                        //son destruction alien
                                        Audio.playSound(Sounds.ALIEN_DESTRUCTION);


                                        // On met à jour notre score suivant le type d'alien
                                        score.set(score.get() + Constants.ALIEN_POINTS * alien.getType());
                                }
                        }
                }
        }

        @FXML
        public void onKeyReleased(KeyEvent keyEvent){
                shipDeltaX = 0;
        }

        @FXML
        void onStopAction() {
                lblScore.setVisible(false);
                lblLeftScore.setVisible(false);
                timer.stop();
                initStartButton = false;
                for (int i = 0; i< 5 ; i++) {
                        for (int j = 0; j < 10; j++)
                                board.getChildren().remove(aliens[i][j]);
                }
                board.getChildren().removeAll(walls);
                board.getChildren().remove(shipShot);
                board.getChildren().removeAll(alienShotList);
                board.getChildren().remove(ship);
                Animation.animateLogoSpaceInvaders(imgLogo, -500, 0, 600,0 ,1, 1000);
        }



}
