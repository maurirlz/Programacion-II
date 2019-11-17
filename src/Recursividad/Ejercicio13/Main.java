package Recursividad.Ejercicio13;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEven(1)); // false
        System.out.println(isEven(2)); // true

        System.out.println(isOdd(2)); // false
        System.out.println(isOdd(3)); // true
    }

    private static boolean isEven(int number) {

        if (number % 2 == 0) {

            return true;
        } else {
            return isOdd(number-1);
        }
    }

    private static boolean isOdd(int number) {

        return !isEven(number);
    }
}