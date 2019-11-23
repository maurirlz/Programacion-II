package EstructurasLineales.LinkedList.MySinglyLinkedList;

import java.util.NoSuchElementException;

public class MyPersonalLinkedList<T> implements PersonalLinkedList<T>{

    private Node<T> head;
    private int size = 0;

    @Override
    public void addFirst(T value) {

        Node<T> node = new Node<>(value);

        if (isEmpty()) {

            head = node;
            size++;
        } else {

            node.setNext(head);
            head = node;
            size++;
        }
    }

    @Override
    public void add(int i, T value) {

        ++size;
        Node<T> newNode = new Node<>(value);

        if (isEmpty() || i == 0) {

            newNode.setNext(head);
            head = newNode;
        } else if (i > 0){

            Node<T> aux = getNode(i);
            Node<T> prevAux = getNode(i - 1);

            prevAux.setNext(newNode);
            newNode.setNext(aux);
        } else {
            --size;
            throw new NoSuchElementException("Index is less than 0.");
        }
    }

    @Override
    public void clear() {

        head = null;
        size = 0;
    }

    @Override
    public boolean contains(T value) {

        Node<T> aux = head;
        boolean flag = false;

        while (aux != null) {

            if (aux.getValue().equals(value)) {

                flag = true;
                break;
            }
            aux = aux.getNext();
        }

        return flag;
    }

    private Node<T> getNode(int i) {

        Node<T> aux = head;
        int count = 0;

        if (i < size && i >= 0) {

            while (count < i) {

                aux = aux.getNext();
                count++;
            }

            return aux;
        } else {

            throw new NoSuchElementException("No such index in list, index is greater than the whole size of the list.");
        }
    }

    @Override
    public T get(int i) {

        Node<T> aux = getNode(i);

        return aux.getValue();
    }

    @Override
    public T getFirst() {

        return head.getValue();
    }

    @Override
    public T getLast() {

        Node<T> aux = head;
        while (aux.getNext() != null) {

            aux = aux.getNext();
        }

        return aux.getValue();
    }

    @Override
    public int indexOf(T value) {

        int i = 0;
        Node<T> aux = head;

        if (contains(value)) {

            while (i < size) {

                if (aux.getValue().equals(value)) {

                    return i;
                }

                aux = aux.getNext();
                i++;
            }
        }

        System.out.println("No such element in list, returning -1.");
        return -1;
    }

    @Override
    public boolean isEmpty() {

        return size == 0 && head == null;
    }

    @Override
    public T removeFromFront() {

        Node<T> removedNode = head;

        if (isEmpty()) {

            System.out.println("List is empty.");
            return null;
        } else {

            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode.getValue();
        }
    }

    @Override
    public T set(int i, T o) { // settea el valor del nodo i al valor del objeto O, retorna el objeto reemplazado.

        Node<T> desiredNode = getNode(i);
        T temp = desiredNode.getValue();
        desiredNode.setValue(o);

        return temp;
    }

    @Override
    public T remove(int i) {

        if (isEmpty()) {

            System.out.println("List is empty.");
            return null;

        } else if (i > 0) {

            Node<T> prevDeleted = getNode(i - 1);
            Node<T> deletedNode = getNode(i);

            prevDeleted.setNext(deletedNode.getNext());
            deletedNode.setNext(null);
            size--;

            return deletedNode.getValue();
        } else {

            return removeFromFront();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void printList() {

        Node<T> current = head;

        if (!isEmpty()) {

            System.out.print("HEAD -> ");
            while (current != null) {

                System.out.print(current);
                System.out.print(" -> ");
                current = current.getNext();
            }

            System.out.println("null");

        } else {

            System.out.println("List is empty.");
        }
    }
}
