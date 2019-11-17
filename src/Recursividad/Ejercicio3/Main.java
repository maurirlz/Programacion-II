package Recursividad.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        int[] arrayOfInts = {5,2,45,2,1};
        int index = 0;
        int max = arrayOfInts[0];

        findBiggestNumber(index, arrayOfInts, max);
    }

    private static void findBiggestNumber(int index, int[] arrayOfInts, int max) {

        if (index < arrayOfInts.length) {

            if (max < arrayOfInts[index]) {

                max = arrayOfInts[index];
            }
            System.out.println("Maximum number in array: " + max);
            findBiggestNumber((index + 1), arrayOfInts,max);
        }
    }
}
