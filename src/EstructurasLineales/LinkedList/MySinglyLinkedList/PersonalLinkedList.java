package EstructurasLineales.LinkedList.MySinglyLinkedList;

public interface PersonalLinkedList<T> {

    void add(int i, T value);

    void addFirst(T value);

    void clear();

    boolean contains(T value);

    T get(int i);

    T getFirst();

    T getLast();

    int indexOf(T value);

    boolean isEmpty();

    T remove(int i);

    T removeFromFront();

    T set(int i, T o);

    int size();

    void printList();

}
