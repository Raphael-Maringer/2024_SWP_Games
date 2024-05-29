package at.ram.Bilder;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Monkey implements Actor {
    private Image monkeyimage;
    private float x,y;

    public Monkey() throws SlickException {
        Image tmp = new Image("at/ram/Bilder/monkey.png");
        this.monkeyimage = tmp.getScaledCopy(200,100);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        monkeyimage.draw(this.x,this.y);
    }

    @Override
    public void update(int delta) {
        this.x++;
    }
}
