package at.dichter.test;

import org.newdawn.slick.Graphics;

public class RectActor extends Actor {
    public RectActor(int x, int y, Integer speed, MovementPatterns pattern) {
        super(x, y, speed, pattern);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 20, 20);
    }
}