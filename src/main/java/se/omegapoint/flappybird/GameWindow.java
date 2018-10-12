package se.omegapoint.flappybird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

class GameWindow extends JPanel implements ActionListener {
        Timer timer;

        private static int panelWidth, panelHeight;		//these are static so we can reach these from anywhere.

        GameWindow(int panelWidth, int panelHeight, int borderThickness) {
            this.panelWidth = panelWidth;
            this.panelHeight = panelHeight;
            setPreferredSize(new Dimension(panelWidth, panelHeight));
            setBackground(Color.DARK_GRAY);
            setBorder(BorderFactory.createLineBorder(Color.WHITE, borderThickness));

            int movementDelay = 5;
            timer = new Timer(movementDelay, this);
            timer.setInitialDelay(0);
        }

        static int getPanelWidth() {
            return panelWidth;
        }

        static int getPanelHeight() {
            return panelHeight;
        }

        @Override
        public void paintComponent(Graphics g) {
            g.setColor(g.getColor().RED);
            super.paintComponent(g);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        // this is where we end up

        repaint();
    }
}

