package EstructurasLineales.Queue.MyPersonalQueue;

public class Main {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();


        queue.clearQueue();
        System.out.println(queue.isEmpty());
    }
}
