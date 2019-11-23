package EstructurasLineales.Stack;

import java.util.NoSuchElementException;

public class Stack<T> {

   Node<T> head;

   public void push(T stuff) {

       head = new Node<>(stuff, this.head);
   }

   public T pop() throws NoSuchElementException {
       if (head == null) {

           throw new NoSuchElementException();
       }

       T aux = head.data;
       head = head.previous;

       return aux;
   }

   public boolean isEmpty() {
       return head == null;
   }

   T peek() {
       if (head == null) {

           throw new NoSuchElementException("The stack is empty.");
       }

       return head.data;
   }
}
