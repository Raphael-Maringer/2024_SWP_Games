package at.ram.Bilder;
import at.ram.Bilder.actors.Actor;
import at.ram.Bilder.actors.Cannonball;
import at.ram.Bilder.actors.Monkey;
import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    private Monkey monkey;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Monkey monkey = new Monkey();
        this.monkey = monkey;
        this.actors.add(monkey);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : actors) {
            actor.render(graphics);
        }
    }

    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE){
            System.out.println("Shoot");
            Cannonball cb = new Cannonball(this.monkey.getX(), this.monkey.getY());
            this.actors.add(cb);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.ram.Bilder.ObjectsGame("Monkey"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
