package at.dichter.test;

public enum ActorState {
    LEFT(1),
    RIGHT(2),
    DOWN(3),
    UP(4);

    private static final ActorState[] vals = values();
    private int index;
    ActorState(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public ActorState rotate() {
        if(this.index == 4) {
            return vals[0];
        } else {
            return vals[index];
        }
    }
}
