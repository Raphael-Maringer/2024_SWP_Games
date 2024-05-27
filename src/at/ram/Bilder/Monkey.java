package at.ram.Bilder;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Monkey implements Actor {
    private Image monkeyimage;

    public Monkey() {
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        this.monkeyimage = new Image("Bilder/monkey.png");
    }

    @Override
    public void update(int delta) {
        monkeyimage.draw(100,100);
    }
}
