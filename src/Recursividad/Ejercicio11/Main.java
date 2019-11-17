package Recursividad.Ejercicio11;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        System.out.println(ocurrenceOfSevenRecursively(77420, 0));
    }

    private static int ocurrenceOfSevenRecursively(int number, int count) {

        if (number != 0) {

            if (number % 10 == 7) {
                count++;
            }

            number /= 10;
            return  ocurrenceOfSevenRecursively(number, count);
        } else {

            return count;
        }
    }
}
