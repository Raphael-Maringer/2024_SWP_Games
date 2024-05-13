package at.ram.Analyse;

import at.ram.Aufgabe1Object.Rectangles;
import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangle rectangle;
    private Rectangle rectangle1;


    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100,100,5);
        this.rectangle1 = new Rectangle(5,400,10);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.rectangle1.update(delta);

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hello you!", 50, 50);
        this.rectangle.render(graphics);
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
