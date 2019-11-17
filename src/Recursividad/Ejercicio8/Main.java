package Recursividad.Ejercicio8;

public class Main {
    public static void main(String[] args) {

        System.out.println(divisionBy2WithSubtraction(7));
    }

    private static int divisionBy2WithSubtraction(int number) {

        if (number < 2) {
            return 0;
        }
        return divisionBy2WithSubtraction(number - 2) + 1;
    }
}
