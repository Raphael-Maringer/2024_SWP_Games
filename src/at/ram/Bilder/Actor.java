package at.ram.Bilder;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Actor {
    public void render(Graphics graphics) throws SlickException;

    public void update(int delta);
}