package at.dichter.test;

public class MovementDelta {
    public int deltaX;
    public int deltaY;
    public ActorState state;
    public int direction;

    public MovementDelta(int deltaX, int deltaY, ActorState state, int direction) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.state = state;
        this.direction = direction;
    }
}
