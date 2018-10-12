package se.omegapoint.flappybird;

import javax.swing.*;
import java.awt.*;

public class Bird {
    private final Rectangle hitBox;
    private Image divingBird;

    public Bird(final int xPos, final int yPos, final int width, final int height) {
        hitBox = new Rectangle(xPos, yPos, width, height);
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/main/resources/flying-taco.png");
        divingBird = ii.getImage();

        hitBox.width = divingBird.getWidth(null);
        hitBox.height = divingBird.getHeight(null);
    }

    public int width() {
        return hitBox.width;
    }

    public int xPos() {
        return hitBox.x;
    }

    public Rectangle hitBox() {
        return hitBox;
    }

    public int yPos() {
        return hitBox.y;
    }

    public int height() {
        return hitBox.height;
    }

    public void setYPos(int yPos) {
        hitBox.y += yPos;
    }

    public void setXPos(final int i) {
        hitBox.x += i;
    }
}
