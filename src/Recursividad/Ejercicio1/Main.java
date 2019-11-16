package Recursividad.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        oneToTen(number);
    }

    private static void oneToTen(int number) {

        if (number > 0  && number <= 10) {

            System.out.println(number);
            oneToTen(number +1);
        }
    }
}
