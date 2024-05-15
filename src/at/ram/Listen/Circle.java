package at.ram.Listen;
import java.util.Random;
import org.newdawn.slick.Graphics;

public class Circle {
    private float x,y;
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
        this.y += (float)delta / this.speed;

        if (this.y > 800) {
            this.y = 0;
        }
    }
}
