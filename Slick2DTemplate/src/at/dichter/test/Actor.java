package at.dichter.test;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class Actor {
    protected int x, y, speed;
    private int _x, _y;
    private int direction = 1;
    private ActorState state = ActorState.RIGHT;
    private MovementPatterns movement;
    public Actor(int x, int y, int speed, MovementPatterns pattern) {
        this.x = x;
        this.y = y;
        this.speed = speed;

        this._x = x;
        this._y = y;

        ActorsSingleton.getInstance().addActor(this);
    }

    public void update(GameContainer gc, int delta) {
        MovementDelta res = Movement.Square(gc.getWidth(), gc.getHeight(), direction, delta, state, x, y, _x, _y);

        this.x += res.deltaX;
        this.y += res.deltaY;
        this.direction = res.direction;
        this.state = res.state;
    }

    public void reset() {
        x = _x;
        y = _y;
    }

    public abstract void render(Graphics graphics);
}