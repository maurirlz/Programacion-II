package Recursividad.Ejercicio14;

public class Main {

    // no me salio, no copiar, f

    public static void main(String[] args) {

        System.out.println(isPositive(3)); // true
        System.out.println(isPositive(-1)); // false

        System.out.println(isNegative(-1)); // true
        System.out.println(isNegative(3)); // false
    }

    private static boolean isPositive(int number) {

        if (number >= 1) {

            return true;
        } else {

            return isNegative(number-1);
        }
    }

    private static boolean isNegative(int number) {

        if (number <= -1) {

            return true;
        } else {

            return !(isPositive(number));
        }
    }
}
