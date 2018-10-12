package se.omegapoint.flappybird.objects;

import java.awt.*;

public class Pipe {

    private final int WIDTH = 50;
    private final int HEIGHT = 100;
    private final int VELOCITY = 1;
    public final Rectangle rectangle;

    public Pipe(int xPos, int yPos) {
        rectangle = new Rectangle(xPos,yPos,WIDTH,HEIGHT);
    }

    public Graphics render(Graphics g) {
        g.setColor(Color.GREEN);

        g.fillRect((int)rectangle.getX(),(int)rectangle.getY(),(int)rectangle.getWidth(), (int)rectangle.getHeight());
        return g;
    }

    public void update() {
        rectangle.setLocation((int)rectangle.getX() - VELOCITY, (int)rectangle.getY());
    }

    public boolean isCollision(Bird bird) {
        return rectangle.intersects(bird.rectangle);

    }

    public boolean hasPassed() {
        return rectangle.x + WIDTH <= 0;
    }
}
