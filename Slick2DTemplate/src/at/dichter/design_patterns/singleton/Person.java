package at.dichter.design_patterns.singleton;

public class Person {
    private String name;
    private float height;

    private IdManager man = IdManager.getInstance();

    public Person(String name, float height) {
        this.name = name;
        this.height = height;
        man.addEmployee(this);
    }

    public String getName() { return name; }
}
