package se.omegapoint.flappybird;

import javax.swing.JFrame;

public class FlappyBird
{
    public static void main(String[] args)
    {
        GameController controller = new GameController();
        GameWindow gameWindow = new GameWindow(300, 300, 5);
        GameFrame gameFrame = new GameFrame(gameWindow, controller);
        JFrame jframe = new JFrame("Flappy bird");
    }

}
