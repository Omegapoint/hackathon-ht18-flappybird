package se.omegapoint.flappybird;

import se.omegapoint.flappybird.objects.Bird;
import se.omegapoint.flappybird.objects.Pipe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Game {
    private final Bird bird;
    private List<Pipe> pipes = new ArrayList<>();
    private final int width;
    private final int height;
    private int counter = 0;

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        bird = new Bird(20,height/2);
        pipes.add(new Pipe(width, height/2));
    }

    public void action() {
        bird.flap();
    }

    public Graphics render(final Graphics g) {
        bird.render(g);
        pipes.stream().forEach(pipe -> pipe.render(g));
        return g;
    }

    public void update() {
        bird.update();
        pipes.stream().forEach(pipe -> pipe.update());
        counter ++;
        if (counter == 100) {
            pipes.add(new Pipe(width, height/2));
            counter = 0;
        }
    }
}
