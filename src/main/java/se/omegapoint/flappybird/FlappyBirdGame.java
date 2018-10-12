package se.omegapoint.flappybird;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.environment.Environment;
import de.gurkenlabs.litiengine.environment.tilemap.xml.Map;
import de.gurkenlabs.litiengine.graphics.RenderEngine;

public class FlappyBirdGame {
    public static void main(String[] args) {
        Game.setInfo("gameinfo.xml");
        Game.init();
        Game.getScreenManager().addScreen(new IngameScreen(new RenderEngine()));

        Game.start();

        Game.loadEnvironment(new Environment(new Map()));



        Game.addGameTerminatedListener(() -> {
            System.out.println("Game version is: " + Game.getInfo().getVersion());
        });
    }
}
