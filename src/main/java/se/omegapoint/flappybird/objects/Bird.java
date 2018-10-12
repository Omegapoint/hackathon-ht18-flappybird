package se.omegapoint.flappybird.objects;


import java.awt.*;

public class Bird {
    private int xPos, yPos;
    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private double velocity = 0;
    private final int GRAVITY = 1;

    public Bird(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void flap() {
        if (velocity < 5 && yPos > 0)
            velocity += 5;
    }

    public Graphics render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        return g;
    }

    public void update() {
        if (yPos > 0) {
            yPos -= velocity + GRAVITY;
        } else {
            yPos = 20;
            velocity = 0;
        }
        velocity -= 0.1;
    }
}
