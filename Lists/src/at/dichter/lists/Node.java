package at.dichter.lists;

public class Node<E> {
    private E element;
    Node<E> previous;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }

    public E get() { return element; }
}
