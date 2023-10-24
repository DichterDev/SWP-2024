package at.dichter.test;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int x,y;
    private List<ActorState> active_states = new ArrayList<>();
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta) {
        if(active_states.contains(ActorState.RIGHT) && active_states.contains(ActorState.LEFT)) {
            return;
        } else if(active_states.contains(ActorState.RIGHT)) {
            if(x + 20 < gc.getWidth()) this.x = x + delta;
            else System.out.println(x);
        } else if(active_states.contains(ActorState.LEFT)) {
            if(x > 1) this.x = x - delta;
        }

        if(active_states.contains(ActorState.UP) && active_states.contains(ActorState.DOWN)) {
            return;
        } else if(active_states.contains(ActorState.UP)) {
            if(y > 0) this.y = y - delta;
        } else if(active_states.contains(ActorState.DOWN)) {
            if(y + 20 < gc.getHeight()) this.y = y + delta;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 20, 20);
    }

    public void keyPress(int key) {
        if(key == Input.KEY_W || key == Input.KEY_A || key == Input.KEY_S || key == Input.KEY_D) {
            if(key == Input.KEY_W) {
                active_states.add(ActorState.UP);
            } if(key == Input.KEY_A) {
                active_states.add(ActorState.LEFT);
            } if(key == Input.KEY_S) {
                active_states.add(ActorState.DOWN);
            } if(key == Input.KEY_D) {
                active_states.add(ActorState.RIGHT);
            }
        }
    }

    public void keyRelease(int key) {
        if(key == Input.KEY_W || key == Input.KEY_A || key == Input.KEY_S || key == Input.KEY_D) {
            if(key == Input.KEY_W) {
                active_states.remove(ActorState.UP);
            } if(key == Input.KEY_A) {
                active_states.remove(ActorState.LEFT);
            } if(key == Input.KEY_S) {
                active_states.remove(ActorState.DOWN);
            } if(key == Input.KEY_D) {
                active_states.remove(ActorState.RIGHT);
            }
        }
    }
}