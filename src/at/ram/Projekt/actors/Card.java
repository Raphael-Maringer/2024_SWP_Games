package at.ram.Projekt.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Card implements Actor{
    private Image front;
    private Image back;
    private Image currentSide;
    private boolean isFront;
    private int points;
    private float x,y;

    public Card(Image front, Image back, int points) {
        this.front = front;
        this.back = back;
        this.currentSide = back;
        this.points = points;
        this.isFront = false;
        this.x = 300;
        this.y = 250;
    }

    public void flip() {
        if (this.currentSide == this.front) {
            this.currentSide = this.back;
        } else {
            this.currentSide = this.front;
        }
    }


    @Override
    public void render(Graphics graphics) throws SlickException {
        this.currentSide.draw(this.x, this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }

    public int getPoints() {
        return points;
    }
}
