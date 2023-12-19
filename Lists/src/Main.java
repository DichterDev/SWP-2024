import at.dichter.lists.LinkedList;
import at.dichter.lists.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("asdf");
        list.add("asdf");
        list.add("list");
        list.add("asdf");
        list.add("asdf");
        list.add("asdf");
        list.add("asdf");
        list.add("asdf");
        list.print();

        list.remove(0);

        System.out.println("");

        list.print();
    }
}
