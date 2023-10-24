package at.dichter.design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        IdManager m1 = IdManager.getInstance();
        IdManager m2 = IdManager.getInstance();

        System.out.println(m1.getIdEmployee());
        System.out.println(m2.getIdEmployee());
        System.out.println(m2.getIdEmployee());
        System.out.println(m1.getIdEmployee());
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        new Person("David", 1.9f);
        for(var p : m1.getEmployees()) {
            System.out.println(p.getName());
        }
    }
}
