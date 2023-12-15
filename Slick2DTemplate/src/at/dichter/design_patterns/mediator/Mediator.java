package at.dichter.design_patterns.mediator;

import java.util.Date;

public class Mediator {
    public static void showMessage(Subject subject, String message) {
        System.out.println("[" + new Date().toString() + "] " + subject.getName() + ": " + message);
    }
}
