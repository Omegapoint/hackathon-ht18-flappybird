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
        System.out.println("PaintComponent");
        g.setColor(new Color(222,222,22));
        g.drawRect(0,0,10,10);
        System.out.println("Render now");
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // this is where we end up
        repaint();
        //System.out.println("actionPerformed");
    }
}

