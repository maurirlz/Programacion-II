package Recursividad.Ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired dimension for the array of ints.");

        int dimension = sc.nextInt();
        int[] arrayOfInts = new int[dimension];

        System.out.println("Enter " + dimension + " numbers");
        for (int i = 0; i < arrayOfInts.length; i++) {

            arrayOfInts[i] = sc.nextInt();
        }

        System.out.println("Enter the number of index from where to start the sum (remember that the index starts at 0, not 1, so an array of dimension 5 has indexes 0, 1, 2, 3, 4): ");
        int index = sc.nextInt();

        System.out.println("Sum of all integers in the array : " + sumOfAllElementsOfArray(arrayOfInts, index));
    }

    private static int sumOfAllElementsOfArray(int[] arrayOfInts, int index) {

        if (index < arrayOfInts.length) {

            return sumOfAllElementsOfArray(arrayOfInts, index + 1) + arrayOfInts[index];
        } else {
            return 0;
        }
    }
}
