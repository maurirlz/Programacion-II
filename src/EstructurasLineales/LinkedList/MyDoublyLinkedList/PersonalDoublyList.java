package EstructurasLineales.LinkedList.MyDoublyLinkedList;

public interface PersonalDoublyList<T> {

    void addFront(T value);

    void add(int i, T value);

    void addLast(T value);

    void clear();

    boolean contains(T value);

    T get(int i);

    T getFirst();

    T getLast();

    int indexOf(T value);

    boolean isEmpty();

    int lastIndexOf(T value);

    T remove(int i);

    T removeFromFront();

    T removeFromLast();

    T set(int i, T o);

    int size();

    void printList();

}
