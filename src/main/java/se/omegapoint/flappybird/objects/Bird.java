package se.omegapoint.flappybird.objects;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;

public class Bird {
    private int xPos, yPos;
    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private int velocity = 0;
    private final int GRAVITY = 1;

    public Bird(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void flap() {
        System.out.println(yPos);
        velocity += 40;

    }

    public Graphics render(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);
        return g;
    }

    public void update() {

        yPos -= (velocity/4) + GRAVITY;
        velocity -= 5;

    }
}
