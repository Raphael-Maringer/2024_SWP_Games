package at.ram.Bilder.actors;

import at.ram.Bilder.actors.Actor;
import org.newdawn.slick.*;

public class Monkey implements Actor {
    private Image monkeyimage;
    private float x,y;

    public Monkey() throws SlickException {
        Image tmp = new Image("at/ram/Bilder/images/monkey.png");
        this.monkeyimage = tmp.getScaledCopy(150,100);
        this.x = 200;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        monkeyimage.draw(this.x,this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
            this.y++;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
            this.y--;
        }
    }

    public float getX() {
        return x + 75;
    }

    public float getY() {
        return y - 10;
    }
}
