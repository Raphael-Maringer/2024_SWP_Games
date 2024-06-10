package at.ram.Projekt.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.List;

public class Deck implements Actor{
    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
