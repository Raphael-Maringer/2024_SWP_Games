package at.ram.Aufgabe1_07;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x, y;
    private float speed;
    private int diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.diameter = random.nextInt(20) + 20;
        this.speed = random.nextInt(40) + 10;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(int delta) {
        Random random = new Random();
        this.y += (float) delta / this.speed;
        this.diameter += (float) delta / this.speed;
        this.diameter += (float)delta/speed;
        if (this.y > 600){
            this.y = 0;
            this.diameter = random.nextInt(20) + 20;
        }
    }
}
