package se.omegapoint.flappybird;

import se.omegapoint.flappybird.objects.Bird;

import java.awt.*;

public class Game {
    private final Bird bird;
    private final int width;
    private final int height;

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        bird = new Bird(20,height/2);
    }

    public void action() {
        bird.flap();
    }

    public Graphics render(final Graphics g) {
        bird.render(g);
        return g;
    }

    public void update() {
        bird.update();
    }
}
