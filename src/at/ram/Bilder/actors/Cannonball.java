package at.ram.Bilder.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Cannonball implements Actor{
    private float x,y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.fillOval(this.x, this.y, 10,10);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
    }
}
