package se.omegapoint.flappybird;

import java.awt.*;

public class Game {
    public void action() {
        System.out.println("Someone did something");
    }

    public Graphics render(final Graphics g) {
        g.setColor(Color.CYAN);
        g.drawRect(50,50,10,10);
        return g;
    }
}
