package at.ram.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private enum DIRECTION{RIGHT, LEFT, DOWN, UP};

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
        this.sq_x += (float) delta/speed;
        if (this.sq_x > 600) {
            this.sq_direction = DIRECTION.DOWN;
        }
    }

        if (sq_direction == DIRECTION.DOWN) {
            this.sq_x += (float) delta/speed;
            if (this.sq_y > 400) {
                this.sq_direction = DIRECTION.LEFT;
            }
        }

        if (sq_direction == DIRECTION.LEFT) {
            this.sq_x += (float) delta/speed;
            if (this.sq_y > 100) {
                this.sq_direction = DIRECTION.UP;
            }
        }

        if (sq_direction == DIRECTION.LEFT) {
            this.sq_x += (float) delta/speed;
            if (this.sq_x > 400) {
                this.sq_direction = DIRECTION.UP;
            }
        }

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
