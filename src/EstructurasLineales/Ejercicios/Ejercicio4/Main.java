package EstructurasLineales.Ejercicios.Ejercicio4;

import EstructurasLineales.Stack.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> charStack = new Stack<>();

        System.out.println("Ingrese cuantos caracteres seran ingeados.");
        int maxCaracteres = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < maxCaracteres; i++) {

            System.out.println("Ingrese caracter numero [" + (i + 1) +"]");
            charStack.push(sc.next().charAt(0));
        }

        System.out.println("Mostrando caracteres ingresados linea por linea: ");
        while (!charStack.isEmpty()) {

            System.out.println(charStack.pop());
        }
    }
}
