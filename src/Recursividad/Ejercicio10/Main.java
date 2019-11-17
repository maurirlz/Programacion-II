package Recursividad.Ejercicio10;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(123, 0));
    }

    private static int sumOfDigits(int number, int sum) {

        if (number != 0) {

            sum += number % 10;
            number /= 10;
            return sumOfDigits(number, sum);
        } else {

            return sum;
        }
    }
}
