package EstructurasLineales.Queue.MyPersonalQueue;

import java.util.NoSuchElementException;

class MyQueue<T> {

    private MyDoublyLinkedList<T> queue;

    MyQueue() {

        this.queue = new MyDoublyLinkedList<>();
    }

    void enqueue(T value) { // mete al final de la cola

        queue.addLast(value);
    }

    T dequeue() throws NoSuchElementException{ // remueve desde el frente de la cola

        return queue.removeFromFront();
    }

    T peek() throws NoSuchElementException { // chequea la head de la lista

        return queue.getFirst();
    }

    private int size() {

        return queue.size();
    }

    boolean isEmpty() {

        return size() == 0;
    }

    void clearQueue() {

        queue.clear();
    }

    void printQueue() {

        queue.printList();
    }
}
