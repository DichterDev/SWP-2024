package at.dichter.design_patterns.mediator;

public class Main {
    public static void main(String[] args) {
        Subject hans = new Subject("Hans");
        Subject peter = new Subject("Peter");

        hans.sendMessage("Vallah");
        peter.sendMessage("ongS");
    }
}
