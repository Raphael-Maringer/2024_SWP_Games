package at.ram.Projekt.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Card implements Actor{
    private Image top;
    private Image back;
    private int points;

    public Card(Image top, Image back) {
        this.top = top;
        this.back = back;
        this.points = points;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        this.top.draw();
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
