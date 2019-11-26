package EstructurasLineales.Stack.StackWithLinkedList;

import java.util.EmptyStackException;
import EstructurasLineales.LinkedList.MySinglyLinkedList.*;

public class StackWithLinkedList<T> implements MyStack<T> {

    private MyPersonalLinkedList<T> stack;

    public StackWithLinkedList() {

        this.stack = new MyPersonalLinkedList<>();
    }

    @Override
    public T pop() throws EmptyStackException {

        if (isEmpty()) {

            throw new EmptyStackException();
        }

        return stack.removeFromFront();
    }

    @Override
    public void push(T data) {

        stack.addFirst(data);
    }

    @Override
    public T peek() throws EmptyStackException {
        if (isEmpty()) {

            throw new EmptyStackException();
        }

        return stack.getFirst();
    }

    @Override
    public boolean isEmpty() {

        return stack.isEmpty();
    }
}
