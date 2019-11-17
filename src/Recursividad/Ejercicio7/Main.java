package Recursividad.Ejercicio7;

public class Main {
    public static void main(String[] args) {

        System.out.println(recursiveFactorial(10));
    }

    private static int recursiveFactorial(int number) {

        if (number == 1) {
            return 1;
        } else {

            return recursiveFactorial(number - 1) * number;
        }
    }
}
