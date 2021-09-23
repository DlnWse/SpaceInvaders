package fr.dylan.spaceinvaders.utils;

import fr.dylan.spaceinvaders.entities.Alien;
import javafx.scene.paint.ImagePattern;

public class Utility {
    public static boolean aliensTouchRightSide(Alien[][] aliens){
        boolean response = false;
        for (int column = 0; column < 10; column++){
            for (int line = 0; line < 5; line++){
               if (aliens[line][column].getX() > Constants.WINDOW_WIDTH - Constants.ALIEN_WIDTH - Constants.WINDOW_MARGIN - Constants.ALIEN_DELTAX){
                   response = true;
                   break;               }
            }
        }
        return response;
    }

    public static boolean aliensTouchLeftSide(Alien[][] aliens){
        boolean response = false;
        for (int column = 0; column < 10; column++){
            for (int line = 0; line < 5; line++){
                if (aliens[line][column].getX() < Constants.WINDOW_MARGIN){
                    response = true;
                    break;               }
            }
        }
        return response;
    }

    public static void displayAlternateAlienImage(Alien[][] aliens, int imageNumber) {
        for (int column = 0; column < 10; column++) {
            if (imageNumber == 1) {
                aliens[0][column].setFill(new ImagePattern(Images.ALIENHIGH1));
            } else if (imageNumber == 2) {
                aliens[0][column].setFill(new ImagePattern(Images.ALIENHIGH2));
            }
            for (int line = 1; line < 3; line++) {
                if (imageNumber == 1) {
                    aliens[line][column].setFill(new ImagePattern(Images.ALIENMIDDLE1));
                } else if (imageNumber == 2) {
                    aliens[line][column].setFill(new ImagePattern(Images.ALIENMIDDLE2));
                }
            }
            for (int line = 3; line < 5; line++) {
                if (imageNumber == 1) {
                    aliens[line][column].setFill(new ImagePattern(Images.ALIENBOTTOM1));
                } else if (imageNumber == 2) {
                    aliens[line][column].setFill(new ImagePattern(Images.ALIENBOTTOM2));
                }
            }
        }
    }
}
