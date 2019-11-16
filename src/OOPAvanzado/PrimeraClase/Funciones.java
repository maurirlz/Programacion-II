package OOPAvanzado.PrimeraClase;

import java.util.*;

public class Funciones {
    public static void main(String[] args) {

        // Realizar un programa que detecte e informe si dos numeros son amigos. Dos numeros son amigos si la suma de los divisores del primero (sin contar al numero)
        // es igual al segundo y viceversa.

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un primer numero.");
        int num1 = lector.nextInt();
        System.out.println("Ingrese un segundo numero.");
        int num2 = lector.nextInt();
        lector.close();

        System.out.println("Chequeo de numeros amigos.");

        if (numerosAmigos(num1, num2)) {

            System.out.println("Los numeros ingresados son amigos");
        } else {

            System.out.println("Los numeros ingresados no son amigos");
        }

        System.out.println("Chequeo de numeros perfectos.");

        if (numeroPerfecto(num1)) {

            System.out.println("El primer numero es un numero perfecto.");
        } else {

            System.out.println("El primer numero no es un numero perfecto.");
        }
        if (numeroPerfecto(num2)) {

            System.out.println("El segundo numero es un numero perfecto.");
        } else {

            System.out.println("El segundo numero no es un numero perfecto");
        }

        System.out.println("Chequeo de numeros narcisistas.");

        if (numeroNarcissista(num1)) {

            System.out.println("El primer numero es narcisista.");
        } else {

            System.out.println("El primer numero no es narcisista.");
        }
        if (numeroNarcissista(num2)) {

            System.out.println("El segundo numero es narcisista");
        } else {

            System.out.println("El segundo numero no es narcisista.");
        }

    }

    public static boolean numerosAmigos(int a, int b) {

        int acum1 = 0, acum2 = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                acum1 += i;
            }
        }

        for (int j = 1; j < b; j++) {
            if (b % j == 0) {
                acum2 += j;
            }

        }

        if (acum1 == acum2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroPerfecto(int a) {

        int acum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                acum += i;
            }
        }
        if (acum == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean numeroNarcissista(int a) {

        int aux = a;
        int d, acum = 0;

        while (a > 0) {
            d = a % 10;
            a = a / 10;
            acum += (d * d * d);
        }
        if (acum == aux) {
            return true;
        } else {
            return false;
        }

    }
}
