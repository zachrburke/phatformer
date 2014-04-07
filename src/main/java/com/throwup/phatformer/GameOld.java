package com.throwup.phatformer;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * A game using Slick2d
 */
public class GameOld extends BasicGame {

    /** A counter... */
    private int counter;

    public GameOld() {
        super("A Slick2d game");
    }

    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("Hello, " + Integer.toString(counter) + "!", 50, 50);
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        counter = 0;
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        counter++;
    }
}
