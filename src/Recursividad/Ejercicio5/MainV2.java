package Recursividad.Ejercicio5;

public class MainV2 {
    public static void main(String[] args) {

        // sacado de internet, una vez que lo resolvi por mi cuenta en el MainV1, busque la mejor forma de hacerlo y la pastee aca
        System.out.println(bunnyEarsRecursion(5000));
    }

    private static int bunnyEarsRecursion(int bunnies) {

        if (bunnies == 0) {

            return 0;
        } else {

            return bunnyEarsRecursion(bunnies - 1) + 2;  // argumento usado como iterador, cada vez que itera
                                                                // sumo 2 a la funcion y llamo recursivamente hasta que bunnies == 0
        }
    }
}
