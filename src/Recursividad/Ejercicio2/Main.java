package Recursividad.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        int number = 9;
        int anotherNumber = 1;
        System.out.println("Tabla del 9: ");

        nineTable(number, anotherNumber);
    }

    private static void nineTable(int number, int anotherNumber) {

        if ((number >= 9 && number <= 90) && (anotherNumber > 0 && anotherNumber <=  10)) {

            System.out.println(" 9 x " + anotherNumber + " = " + number);
            nineTable(number + 9, anotherNumber + 1);
        }
    }
}
