package at.dichter.test;

import java.util.ArrayList;
import java.util.List;

public class ActorsSingleton {
    private static ActorsSingleton _instance = new ActorsSingleton();
    private List<Actor> actors = new ArrayList<>();

    private ActorsSingleton() {}

    public static ActorsSingleton getInstance() { return _instance; }

    public void addActor(Actor a) {
        actors.add(a);
    }

    public List<Actor> getActors() {
        return actors;
    }
}
