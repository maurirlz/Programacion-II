package Recursividad.Ejercicio6;

public class Main {

    public static void main(String[] args) {

        /*Ejercicio 6:
        Tenemos conejitos de pie en una línea, numerados 1, 2, ... Los conejitos en posiciones impares (1, 3, ..)
        tienen las 2 orejas normales. Los conejos en las posiciones pares (2, 4, ..) diremos que tienen 3 orejas,
        porque cada uno tiene un pie levantado. Escriba una función que devuelva recursivamente el número de
        "orejas" en la línea de conejos 1, 2, ... n (sin bucles o multiplicación). */

        /* Explicacion:
        * bunnies = 6, recursion, se suman 3 orejas si bunnies es par y 2 orejas si bunnies es impar, llamados:
        * n = 6, n % 2 == 0 ? si, → return (6 - 1) + 3
        * n = 5 o (6 - 1), n % 2 == 0 ? no, → return (5 - 1) + 2
        * n = 4 o (5 - 1), n % 2 == 0 ? si, → return (4 - 1) + 3
        * n = 3 o (4 - 1), n % 2 == 0 ? no, → return (3 - 1) + 2
        * n = 2 o (3 - 1), n % 2 == 0 ? si, → return (2 - 1) + 3
        * n = 1 o (2 - 1), n % 2 == 0 ? no, → return (1 - 1) + 2
        * n = 0 o (1 - 1), n == 0 ? si, → return 0
        * Termina devolviendo el total acumulado enttre todas las recursiones que se hicieron, (15), se termina usando la misma funcion
        * recursiva como un acumulador. (los valores sumados cada vez que se llaman a la funcion son acumulados en el stack) */

        System.out.println(bunnyEarsRecursion(6));
    }
    private static int bunnyEarsRecursion(int bunnies) {

        /* si el argumento usado como iterador alcanza 0, se acaba la funcion Y retorna el valor acumulado */

        if (bunnies == 0) {
            return 0;
        }

        /* Si la iteracion recursiva es par, se suman 3 orejas en vez de 2, si la iteracion es impar, se suman 2.*/

        if (bunnies % 2 == 0) {

            return bunnyEarsRecursion(bunnies - 1) + 3;

            /* se usa el argumento bunnies(conejos) como iterador, cada vez que se llame a la funcion
            bunnies es restado 1 hasta que alcanze el valor 0, cuando esto pase, se acaba la recursion.*/

        } else {

            return bunnyEarsRecursion(bunnies - 1) + 2;
        }
    }
}
