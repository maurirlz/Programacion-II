package Recursividad.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        System.out.println(fibonacci(30)); // Da como resultado  832040
    }

    private static int fibonacci(int number) {

        if (number == 0) {
            
            return 0;
        } else if (number <= 2) {
            return 1;
        } else {
            return fibonacci(number - 1) + (fibonacci(number - 2));
        }
    }
}
