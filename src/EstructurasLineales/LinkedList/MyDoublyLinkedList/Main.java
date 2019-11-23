package EstructurasLineales.LinkedList.MyDoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyDoublyLinkedList<Integer> doublyList = new MyDoublyLinkedList<>();

        doublyList.addLast(1);
        doublyList.addLast(1);
        doublyList.addLast(3);
        doublyList.addLast(4);

        doublyList.printList();

    }
}
