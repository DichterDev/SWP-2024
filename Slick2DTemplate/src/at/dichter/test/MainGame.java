package at.dichter.test;

import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private Animation rotate;
    private GameContainer container;
    private int rectX;
    private int rectY;
    Player p;
    private ActorsSingleton actors = ActorsSingleton.getInstance();
    private ActorFactory factory = new ActorFactory();
    public MainGame() {
       super("Rectangle");
    }
    private void renderActors(Graphics g) {
        for(var a : actors.getActors()) {
            a.render(g);
        }
    }

    private void updateActors(GameContainer gc, int delta) {
        for(var a : actors.getActors()) {
            a.update(gc, delta);
        }
    }

    private void resetActors() {
        for(var a : actors.getActors()) {
            a.reset();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.container = gameContainer;
        this.rectX = 100;
        this.rectY = 100;
        factory.createActor(ActorType.RECT, MovementPatterns.SQUARE, 100, 100);
        this.p = new Player(gameContainer.getWidth() / 2, gameContainer.getHeight()/ 2);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.container = gameContainer;
        updateActors(gameContainer, i);
        this.p.update(gameContainer, i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.container = gameContainer;
        this.p.render(graphics);
        renderActors(graphics);
    }


    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_ESCAPE) {
            container.exit();
        } else if (key == Input.KEY_1) {
            resetActors();
        }
        this.p.keyPress(key);
    }

    @Override
    public void keyReleased(int key, char c) {
        this.p.keyRelease(key);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame());
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
