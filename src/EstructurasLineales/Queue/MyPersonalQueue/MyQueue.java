package EstructurasLineales.Queue.MyPersonalQueue;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    private MyDoublyLinkedList<T> queue;

    public MyQueue() {

        this.queue = new MyDoublyLinkedList<>();
    }

    public void enqueue(T value) { // mete al final de la cola

        queue.addLast(value);
    }

    public T dequeue() throws NoSuchElementException{ // remueve desde el frente de la cola

        return queue.removeFromFront();
    }

    public T peek() throws NoSuchElementException { // chequea la head de la lista

        return queue.getFirst();
    }

    private int size() {

        return queue.size();
    }

    public boolean isEmpty() {

        return size() == 0;
    }

    public void clearQueue() {

        queue.clear();
    }

    public void printQueue() {

        queue.printList();
    }
}
