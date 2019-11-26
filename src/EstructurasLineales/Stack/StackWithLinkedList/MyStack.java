package EstructurasLineales.Stack.StackWithLinkedList;

import java.util.EmptyStackException;

public interface MyStack<T> {

    T pop() throws EmptyStackException;

    void push(T data);

    T peek() throws EmptyStackException;

    boolean isEmpty();



}
