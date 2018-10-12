package se.omegapoint.flappybird;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventListener implements KeyListener {

    private final Game game;

    public EventListener(final Game game) {
        this.game = game;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game.action();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }
}
