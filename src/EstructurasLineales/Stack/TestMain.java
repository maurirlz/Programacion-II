package EstructurasLineales.Stack;

public class TestMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(50);
        stack.push(100);
        stack.push(150);
        stack.push(200); // head

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        stack.pop();
        System.out.println(stack.peek());


    }
}
