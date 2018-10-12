package se.omegapoint.flappybird;

import com.sun.javafx.tk.FontLoader;
import de.gurkenlabs.litiengine.graphics.RenderEngine;
import de.gurkenlabs.litiengine.gui.screens.Screen;

import java.awt.*;

public class IngameScreen extends Screen {

    private final static String id = "IngameScreen";
    private final RenderEngine renderEngine;

    IngameScreen(final RenderEngine renderEngine) {
        super(id);
        this.renderEngine = renderEngine;
    }

    @Override
    public void render(final Graphics2D g) {
        super.render(g);
        //g.setFont(FontLoader.deriveFont(32f));
        g.setColor(Color.RED);

        renderEngine.renderText(g, "Test text", 100, 100);
    }
}
