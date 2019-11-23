package EstructurasLineales.LinkedList.MySinglyLinkedList;

import java.util.Objects;

public class Node<T> {

    private T value;
    private Node<T> next;

    Node(T value) {

        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(getValue(), node.getValue()) &&
                Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getNext());
    }

    @Override
    public String toString() {

        return "Node's value: " + getValue() + " \n";
    }
}
