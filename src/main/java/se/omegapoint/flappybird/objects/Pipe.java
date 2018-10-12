package se.omegapoint.flappybird.objects;

import java.awt.*;

public class Pipe {
    private int xPos, yPos;
    private final int WIDTH = 50;
    private final int HEIGHT = 100;
    private final int VELOCITY = 1;

    public Pipe(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Graphics render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        return g;
    }

    public void update() {
        System.out.println("CALLED UPDATE");
        System.out.println(xPos);
        xPos -= VELOCITY;
    }
}
