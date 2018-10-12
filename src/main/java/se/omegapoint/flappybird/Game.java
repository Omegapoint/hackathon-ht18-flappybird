package se.omegapoint.flappybird;

import se.omegapoint.flappybird.objects.Bird;
import se.omegapoint.flappybird.objects.Pipe;

import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;


public class Game {
    private Bird bird;
    private List<Pipe> pipes;
    private final int width;
    private final int height;
    private int counter;
    private int score;

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    private void init() {
        counter = 0;
        bird = new Bird(20, height / 2);
        pipes = new ArrayList<>();
        pipes.add(new Pipe(width, height / 2));
        score = 0;
    }

    public void action() {
        bird.flap();
    }

    public Graphics render(final Graphics g) {
        bird.render(g);
        pipes.forEach(pipe -> pipe.render(g));
        return g;
    }

    public void update() {
        System.out.println(score);
        bird.update();
        pipes.forEach(Pipe::update);
        pipes.stream()
                .findFirst()
                .filter(Pipe::hasPassed)
                .map(pipe -> {
                    score++;
                    return pipes.remove(pipe);
                });

        counter++;
        if (counter == 100) {
            pipes.add(new Pipe(width, height / 2));
            counter = 0;
        }
    }

    public boolean isGameOver() {
        return collideFloor() || collidePipes();
    }

    private boolean collideFloor() {
        return bird.bottomPos() > height;
    }

    private boolean collidePipes() {
        return pipes.stream().anyMatch(pipe -> pipe.isCollision(bird));
    }

    public void reset() {
        init();
    }
}
