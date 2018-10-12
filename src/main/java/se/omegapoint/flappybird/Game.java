package se.omegapoint.flappybird;

import java.awt.*;

public class Game {
    public void action() {
        System.out.println("Someone did something");
    }

    public Graphics render(final Graphics g) {
        g.setColor(new Color(222,222,22));
        g.drawRect(0,0,10,10);
        System.out.println("Render now");
        return g;
    }
}
