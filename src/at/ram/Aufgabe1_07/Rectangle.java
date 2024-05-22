package at.ram.Aufgabe1_07;

import at.ram.Aufgabe1Object.Rectangles;
import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    public enum DIRECTION {RIGHT, LEFT, DOWN, UP}

    private float x;
    private float y;
    private float speed;
    private DIRECTION rec_direction = DIRECTION.RIGHT;


    public Rectangle(float x, float y, float speed, DIRECTION rec_direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.rec_direction = rec_direction;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta) {
        if (rec_direction == DIRECTION.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 800) {
                this.x = 0;
            }
        } else if (rec_direction == DIRECTION.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x < 0) {
                this.x = 800;
            }
        }
    }
}
