package EstructurasLineales.Stack;

public class Node<T> {

    T data;
    Node<T> previous;

    Node(T data, Node<T> previous) {
        this.data = data;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
