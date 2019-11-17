package Recursividad.Ejercicio9;

public class Main {
    public static void main(String[] args) {

        // solo funciona para numeros de 3 digitos, no pude pensar una mejor forma because i'm dumb :(

        System.out.println(invertNumber(421));
    }

    private static int invertNumber(int number) {

        if (number > 0) {

            if (number > 99) {

                return invertNumber(number / 10) + number % 10 * 100;
            } else if (number > 9) {

                return invertNumber(number / 10) + number % 10 * 10;
            } else if (number < 9) {

                return invertNumber(number / 10) + number;
            } else {

                return invertNumber(number);
            }
        }

        return number;
    }
}
