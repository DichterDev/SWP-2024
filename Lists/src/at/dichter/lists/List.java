package at.dichter.lists;

public interface List<E> {
    void add(E element);
    void remove(int index);
    E get(int index);

    void print();
}
