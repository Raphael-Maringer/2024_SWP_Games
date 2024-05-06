package at.ram.Aufgabe1Object;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private enum DIRECTION {RIGHT, LEFT, DOWN, UP};

    private float sq_x;
    private float sq_y;
    private DIRECTION sq_direction = DIRECTION.RIGHT;

    private float oval_x;
    private float oval_y;
    private DIRECTION oval_direction = DIRECTION.RIGHT;

    private float cir_x;
    private float cir_y;
    private DIRECTION cir_direction = DIRECTION.DOWN;

    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.sq_x = 50;
        this.sq_y = 50;

        this.oval_x = 50;
        this.oval_y = 50;

        this.cir_x = 50;
        this.cir_y = 50;

        this.speed = 2.0f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if (sq_direction == DIRECTION.RIGHT) {
            this.sq_x += (float) delta / speed;
            if (this.sq_x > 650) {
                this.sq_direction = DIRECTION.DOWN;
            }
        }

        if (sq_direction == DIRECTION.DOWN) {
            this.sq_y += (float) delta / speed;
            if (this.sq_y > 450) {
                this.sq_direction = DIRECTION.LEFT;
            }
        }

        if (sq_direction == DIRECTION.LEFT) {
            this.sq_x -= (float) delta / speed;
            if (this.sq_x < 50) {
                this.sq_direction = DIRECTION.UP;
            }
        }

        if (sq_direction == DIRECTION.UP) {
            this.sq_y -= (float) delta / speed;
            if (this.sq_y < 50) {
                this.sq_direction = DIRECTION.RIGHT;
            }
        }

        if (oval_direction == DIRECTION.RIGHT) {
            this.oval_x += (float) delta / speed;
            if (this.oval_x > 650) {
                this.oval_direction = DIRECTION.LEFT;
            }
        }

        if (oval_direction == DIRECTION.LEFT) {
            this.oval_x -= (float) delta / speed;
            if (this.oval_x < 50) {
                this.oval_direction = DIRECTION.RIGHT;
            }
        }

        if (cir_direction == DIRECTION.DOWN) {
            this.cir_y += (float) delta / speed;
            if (this.cir_y > 450) {
                this.cir_direction = DIRECTION.UP;
            }
        }

        if (cir_direction == DIRECTION.UP) {
            this.cir_y -= (float) delta / speed;
            if (this.cir_y < 50) {
                this.cir_direction = DIRECTION.DOWN;
            }
        }


    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hello you!", 50, 50);
        graphics.drawRect(this.sq_x, this.sq_y, 100, 100);
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
