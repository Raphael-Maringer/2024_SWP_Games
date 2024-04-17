package at.ram.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private float sq_x;
    private float sq_y;

    private float oval_x;
    private float oval_y;

    private float rec_x;
    private float rec_y;

    private float cir_x;
    private float cir_y;

    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.sq_x = 100;
        this.speed = 2.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rec_x = 50;
        this.rec_y = 50;
        this.rec_x += (float) delta / this.speed;

        if (this.oval_x < 500) {
            this.oval_x += (float) delta / this.speed;
        } else if (this.oval_x > 500) {
            this.oval_x += (float) delta / this.speed; }

        this.cir_y += (float) delta / this.speed;

        /* this.x++;
        this.y++;
        if (this.x > 800) {
            this.x = 0;
            this.y = 0;
        } */
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hello you!", 50, 50);
        graphics.drawRect(this.rec_x, this.rec_y, 100, 100);
        graphics.drawOval(this.oval_x, this.oval_y, 100, 50);
        graphics.drawOval(this.cir_x, this.cir_y, 100, 100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
