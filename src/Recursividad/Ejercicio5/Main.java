package Recursividad.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        int bunnys = 50;
        int bunnyEars = 0;
        System.out.println(bunnyEars(bunnys, bunnyEars));
    }

    private static int bunnyEars(int bunnys, int bunnyEars) {

        if (bunnys > 0) {
            return bunnyEars(bunnys - 1,  bunnyEars + 2);
        }

        return bunnyEars;
    }
}
