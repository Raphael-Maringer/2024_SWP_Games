package at.ram.Aufgabe1_07;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50), Rectangle.DIRECTION.LEFT);
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
        }

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(600), random.nextInt(500));
            this.actors.add(ellipse);
        }
    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hello you!", 50, 50);
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangle"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
