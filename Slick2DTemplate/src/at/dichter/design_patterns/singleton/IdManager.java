package at.dichter.design_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private static IdManager instance = new IdManager();
    private int idEmployee = 0;
    private List<Person> employees = new ArrayList<>();
    private IdManager() {};

    public static IdManager getInstance() {
        return instance;
    }

    public int getIdEmployee() {
        this.idEmployee++;
        return this.idEmployee - 1;
    }

    public void addEmployee(Person p) {
        employees.add(p);
    }
    public List<Person> getEmployees() { return employees; }
}
