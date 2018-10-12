package se.omegapoint.flappybird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class GamePanel extends JPanel implements ActionListener {
    private final Timer timer;
    private final Game game;

    GamePanel(int panelWidth, int panelHeight, int borderThickness, final Game game) {
        this.game = game;

        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.WHITE, borderThickness));

        int movementDelay = 5;
        timer = new Timer(movementDelay, this);
        timer.setInitialDelay(0);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

