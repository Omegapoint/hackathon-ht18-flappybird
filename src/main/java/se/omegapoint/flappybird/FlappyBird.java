package se.omegapoint.flappybird;

import javax.swing.*;

public class FlappyBird
{
    public static void main(String[] args)
    {

        Game game = new Game();

        GameController controller = new GameController(game);

        GamePanel gamePanel = new GamePanel(300, 300, 5, game);

        JFrame jframe = new JFrame("Flappy bird");
        jframe.add(gamePanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300, 300);
        jframe.addKeyListener(controller);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }

}
