package fr.dylan.spaceinvaders.entities;


import fr.dylan.spaceinvaders.utils.Images;
import javafx.scene.paint.ImagePattern;
import java.util.ArrayList;
import java.util.Random;

public class Brick extends Entity {

    private static final ArrayList<ImagePattern> bricks = new ArrayList<>();
    private static final Random random = new Random();

    public Brick(double x, double y, double width, double height, ImagePattern sprite) {
        super(x, y, width, height);
        super.setImgPattern(sprite);
        super.setFill(super.getImgPattern());
    }

    public static ImagePattern setRandomBrick() {
        bricks.add(Images.BRICK1);
        bricks.add(Images.BRICK2);
        bricks.add(Images.BRICK3);
        bricks.add(Images.BRICK4);
        bricks.add(Images.BRICK5);
        bricks.add(Images.BRICK6);
        bricks.add(Images.BRICK7);
        int index = random.nextInt(bricks.size());
        return bricks.get(index);
    }
}
