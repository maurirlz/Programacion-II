package Recursividad.Ejercicio9;

public class MainV2 {

    /* Explicacion:
    * Tomando como ejemplo 126, con n = 3 donde n es la cantidad de digitos.
    * Cada llamado recursivo recorre 1 digito y se usa la variable reverse como acumulador para el resultado,
    * Sabiendo que un numero % 10 = al ultimo digito del numero y que si dividis un numero ENTERO <<<<< por 10
    * eliminas tambien ese digito, se puede sacar que:
    * 1er llamado recursivo: number(126), number != 0 ? si → reverse (0) * 10 = 10, reverse = reverse + 126 % 10 (reverse + 6 = 6), number / 10 (12.6, como es entero, 12.)
    * 2do llamado recursivo: number(12), number != 0 ? si → reverse (6) * 10 = 60, reverse = reverse + 12 % 10 (reverse + 2 = 62), number / 10 (1.2, como es entero, 1.)
    * 3er llamado recursivo: number(1), number != 0 ? si → reverse (62) * 10 = 620, reverse = reverse + 1 % 10 (reverse + 1 = 621), number / 10 (0.1, como es entero, 0.)
    * 4to llamado recursivo: number(0), number != 0 ? no → return reverse (con el valor 621, efectivamente invirtiendo 126), vale destacar que este metodo funciona para N digitos.;
    *
    * Si bien esta no es mi resolucion, paso a explicar porque me sirve a mi para entenderlo y poder hacer casos asi en el futuro
    * siendo que recursion es un tema que siempre fue dificil para mi.
    * */

    public static void main(String[] args) {
        // encontrado en StackOverflow, para N digitos
        System.out.println(reverseNumber(126, 0));
    }

    private static int reverseNumber(int number, int reverse) {

        if (number != 0) {

            reverse *= 10;
            reverse += number % 10;
            number /= 10;

        } else {

            return reverse;
        }
        return  reverseNumber(number, reverse);
    }
}
