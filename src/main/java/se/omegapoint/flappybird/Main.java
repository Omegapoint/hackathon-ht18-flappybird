package se.omegapoint.flappybird;

import javax.swing.*;

public class Main {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;

    public static void main(String[] args) {

        Game game = new Game(WIDTH, HEIGHT);

        EventListener controller = new EventListener(game);

        GamePanel gamePanel = new GamePanel(WIDTH, HEIGHT, 5, game);

        JFrame jframe = new JFrame("Flappy bird");
        jframe.add(gamePanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.addKeyListener(controller);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }

}
