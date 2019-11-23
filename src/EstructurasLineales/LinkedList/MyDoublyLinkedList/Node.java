package EstructurasLineales.LinkedList.MyDoublyLinkedList;

import java.util.Objects;

public class Node<T> {

    private T data;
    private Node<T> previous;
    private Node<T> next;

    Node(T data) {

        this.data = data;
    }

    T getData() {
        return data;
    }

    void setData(T data) {
        this.data = data;
    }

    Node<T> getPrevious() {
        return previous;
    }

    void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return "Node's value: " + getData() + " \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(getData(), node.getData()) &&
                Objects.equals(getPrevious(), node.getPrevious()) &&
                Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getPrevious(), getNext());
    }
}
