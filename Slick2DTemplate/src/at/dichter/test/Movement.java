package at.dichter.test;

import org.newdawn.slick.GameContainer;

public class Movement {

    public static MovementDelta Square(final int width, final int height, int direction, final int delta, ActorState state, final int currentX, final int currentY, final int startX, final int startY) {
        int x = 0;
        int y = 0;

        if(state.getIndex() < 3) {
            x = direction * delta;
        } else {
            y = direction * delta;
        }

        if(currentX + x + 1 >= width - startX) {
            state = ActorState.DOWN;
            x = width - startX - currentX;
        }

        if(currentY + y >= height - startY) {
            state = ActorState.LEFT;
            direction = -1;
            y = height - startY - currentY;
        }

        if(currentX + x < startX) {
            state = ActorState.UP;
            x = startX - currentX;
        }

        if(currentY + y < startY) {
            state = ActorState.RIGHT;
            direction = 1;
            y = startY - currentY;
        }

        return new MovementDelta(x, y, state, direction);
    }

    public static MovementDelta Circle(final int currentX, final int currentY, ActorState state, final int r, final int delta) {
        int x = 0;
        int y = 0;

        final int centerX = currentX - radius;
        final int centerY = currentY - radius;

        x = x + delta;

        // equation: centerY +- Math.sqrt(r²-(x-centerX)²)

        y = (int) (centerY + Math.sqrt(Math.pow(x, 2)-Math.pow((x-centerX),2)));

        return new MovementDelta(x, y);
    }
}
