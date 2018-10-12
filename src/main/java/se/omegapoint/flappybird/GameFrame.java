package se.omegapoint.flappybird;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(GameWindow gameWindow, GameController controller) {
        JFrame jframe = new JFrame("Flappy bird");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300, 300);
        jframe.addKeyListener(controller);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.add(gameWindow);
    }
}
