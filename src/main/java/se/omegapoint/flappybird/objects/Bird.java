package se.omegapoint.flappybird.objects;


import java.awt.*;

public class Bird {

    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private double velocity = 0;
    private final int GRAVITY = 1;
    public final Rectangle rectangle;

    public Bird(int xPos, int yPos) {

        rectangle = new Rectangle(xPos,yPos,WIDTH,HEIGHT);

    }

    public void flap() {
        if (velocity < 5 && rectangle.getY() > 0)
            velocity += 5;
    }

    public Graphics render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int)rectangle.getX(),(int)rectangle.getY(),(int)rectangle.getWidth(), (int)rectangle.getHeight());

        return g;
    }

    public void update() {
        if (rectangle.getY()> 0) {
            rectangle.setLocation((int)rectangle.getX(),(int) (rectangle.getY()- velocity + GRAVITY));
        } else {
            rectangle.setLocation(rectangle.x, 20);
           // yPos = 20;
            velocity = 0;
        }
        velocity -= 0.1;
    }

    public int bottomPos() {
        return rectangle.y + HEIGHT;
    }
}
