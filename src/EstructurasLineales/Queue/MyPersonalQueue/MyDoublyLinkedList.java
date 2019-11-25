package EstructurasLineales.Queue.MyPersonalQueue;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<T> implements PersonalDoublyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    @Override
    public void addFront(T value) {

        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {

            tail = newNode;

        } else {

            newNode.setNext(head);
        }

        head = newNode;
        size++;
    }

    @Override
    public void add(int i, T value) {

        ++size;
        Node<T> newNode = new Node<>(value);
        Node<T> auxNode = getNode(i);

        if (isEmpty() || i == 0) {

            newNode.setPrevious(null);
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        } else if (i == (size - 1)) {

            newNode.setNext(null);
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        } else if (i > 0 && i < size) {


            auxNode.getPrevious().setNext(newNode);
            auxNode.setPrevious(newNode);
            newNode.setNext(auxNode);
        } else {
            --size;
            throw new NoSuchElementException("Invalid index.");
        }
    }

    @Override
    public void addLast(T value) {

        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {

            head = newNode;
        } else {

            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }

        tail = newNode;
        size++;
    }

    @Override
    public void clear() {

        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(T value) {

        Node<T> aux = head;
        boolean flag = false;

        while (aux != null) {

            if (aux.getData().equals(value)) {

                flag = true;
                break;
            }
            aux = aux.getNext();
        }
        return flag;
    }

    @Override
    public T get(int i) {

        if (isEmpty()) {

            System.out.println("List is empty.");
            return null;
        }

        Node<T> desiredNode = getNode(i);

        return desiredNode.getData();
    }

    @Override
    public T getFirst() {

        return head.getData();
    }

    @Override
    public T getLast() {

        return tail.getData();
    }

    @Override
    public int indexOf(T value) {

        if (isEmpty()) {

            System.out.println("List is empty.");
            return -1;
        } else if (!contains(value)) {

            System.out.println("Value not in list.");
            return -1;
        } else {

            int count = 0;
            Node<T> aux = head;

            while (count < size) {
                if (aux.getData().equals(value)) {

                    return count;
                }
                aux = aux.getNext();
                count++;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {

        return tail == null && head == null || size == 0;
    }

    @Override
    public int lastIndexOf(T value) {

        if (isEmpty()) {

            System.out.println("List is empty.");
            return -1;
        } else if (!contains(value)) {

            System.out.println("Value not in list.");
            return -1;
        } else {

            Node<T> aux = tail;
            int count = size - 1;

            while (count >= 0) {

                if (aux.getData() == value) {

                    return count;
                }
                aux = aux.getPrevious();
                count--;
            }
        }
        return -1;
    }

    @Override
    public T remove(int i) {

        Node<T> deletedNode;

        if (isEmpty()) {

            System.out.println("Couldn't deleted desired index, list is empty.");
            return null;
        } else if (i == 0) {

            deletedNode = new Node<>(head.getData());

            head.getNext().setPrevious(null);
            head = head.getNext();
            size--;
            return deletedNode.getData();
        } else if (i == (size - 1)) {

            deletedNode = new Node<>(tail.getData());

            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
            size--;
            deletedNode.setPrevious(null);
            return deletedNode.getData();
        } else if (i > 0 && i < size) {

            deletedNode = getNode(i);
            Node<T> previousNode = deletedNode.getPrevious();
            Node<T> nextNode = deletedNode.getNext();

            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
            deletedNode.setPrevious(null);
            deletedNode.setNext(null);
            size--;

            return deletedNode.getData();
        } else {

            throw new NoSuchElementException("Invalid index.");
        }
    }

    @Override
    public T removeFromFront() {

        Node<T> removedNode = head;

        if (isEmpty()) {

            System.out.println("List is empty, couldn't remove element");
            return null;
        }

        if (head.getNext() == null) {

            tail = null;
        } else {

            head.getNext().setPrevious(null);
        }

        head = removedNode.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode.getData();
    }

    @Override
    public T removeFromLast() {

        Node<T> removedNode = tail;

        if (isEmpty()) {

            System.out.println("List is empty, couldn't remove element.");
            return null;
        }

        if (tail.getPrevious() == null) {

            head = null;
        } else {

            tail.getPrevious().setNext(null);
        }

        tail = removedNode.getPrevious();
        size--;
        removedNode.setPrevious(null);

        return removedNode.getData();
    }

    @Override
    public T set(int i, T o) {

        Node<T> desiredNode = getNode(i);
        T backupData = desiredNode.getData();
        desiredNode.setData(o);

        return backupData;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void printList() {

        Node<T> current = head;

        if (!isEmpty()) {

            System.out.print("HEAD -> ");
            while (current != null) {

                if (current == tail) {

                    System.out.print("TAIL ");
                }
                System.out.print(current);
                System.out.print(" <-> ");
                current = current.getNext();
            }

            System.out.println("null");

        } else {

            System.out.println("List is empty.");
        }
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

}
