package at.dichter.test;

public class ActorFactory {
    public void createActor(ActorType type, MovementPatterns movement, int x, int y) {
        if(type == ActorType.RECT) {
            new RectActor(x, y, 1, MovementPatterns.SQUARE);
        }
    }
}
