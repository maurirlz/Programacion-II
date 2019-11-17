package Recursividad.Ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired dimension for the array: ");

        int dimension = sc.nextInt();
        int[] arrayOfInts = new int[dimension];

        System.out.println("Enter " + dimension + " numbers");
        for (int i = 0; i < arrayOfInts.length; i++) {

            arrayOfInts[i] = sc.nextInt();
        }

        System.out.println("Biggest number in the array is: " + searchForBiggestNumber(arrayOfInts, 0, 0));
    }

    private static int searchForBiggestNumber(int[] arrayOfInts, int index, int max) {

        if (index < arrayOfInts.length) {

            if (arrayOfInts[index] > max) {
                max = arrayOfInts[index];
            }

            return searchForBiggestNumber(arrayOfInts, index + 1, max);
        } else {

            return max;
        }
    }
}
