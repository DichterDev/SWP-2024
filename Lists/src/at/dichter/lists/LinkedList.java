package at.dichter.lists;

public class LinkedList<E> implements List<E> {

    public int length = 0;
    Node<E> first;

    @Override
    public void add(E element) {
        if(this.length == 0) {
            this.length++;
            this.first = new Node<>(element);
            return;
        }

        Node<E> last = this.getNode(length - 1);
        last.next = new Node<E>(element);
        last.next.previous = last;
        this.length++;
    }

    @Override
    public void remove(int index) {
        if(index == 0) {
            this.first = first.next;
            first.previous = null;
            length--;
            return;
        }

        Node<E> node = this.getNode(index);
        if(node.previous != null) node.previous.next = node.next;
        if(node.next != null) node.next.previous = node.previous;
        this.length--;
    }

    @Override
    public E get(int index) {
        return this.getNode(index).get();
    }

    @Override
    public void print() {
        if(this.length == 0) {
            System.out.println("{ }");
            return;
        }
        for(int i = 0; i < length; i++) {
            System.out.println(this.getNode(i).get());
        }
    }

    private Node<E> getNode(int index) throws ArrayIndexOutOfBoundsException {
        if(this.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if(index > this.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node<E> temp = first;
        for(int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp;
    }
}

