package fr.dylan.spaceinvaders.entities;


import fr.dylan.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;
import java.util.ArrayList;
import java.util.Random;

public class Brick extends Entity {
    private static final ArrayList<ImagePattern> randomWall = new ArrayList<>();
    private static final Random random = new Random();

    public Brick(double x, double y, double width, double height, ImagePattern sprite) {
        super(x, y, width, height);
        super.setImgPattern(sprite);
        super.setFill(super.getImgPattern());
    }

    public static ImagePattern setRandomBrick() {
        randomWall.add(Images.BRICK1);
        randomWall.add(Images.BRICK2);
        randomWall.add(Images.BRICK3);
        randomWall.add(Images.BRICK4);
        int index = random.nextInt(randomWall.size());
        return randomWall.get(index);
    }
}
