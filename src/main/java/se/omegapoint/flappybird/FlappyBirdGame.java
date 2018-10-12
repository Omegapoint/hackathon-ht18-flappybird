package se.omegapoint.flappybird;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.graphics.RenderEngine;

public class FlappyBirdGame {
    public static void main(String[] args) {
        Game.init();

        Game.getScreenManager().addScreen(new IngameScreen(new RenderEngine()));

        Game.start();

        Game.addGameTerminatedListener(() -> {
            System.out.println("Game version is: " + Game.getInfo().getVersion());
        });
    }
}
