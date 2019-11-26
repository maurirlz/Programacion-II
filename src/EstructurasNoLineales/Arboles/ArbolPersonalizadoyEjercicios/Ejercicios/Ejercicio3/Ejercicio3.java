package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Ingrese una anotacion prefija o polaca.");
        String anotacionPreFija = new Scanner(System.in).nextLine();

        char[] charArray = anotacionPreFija.toCharArray();

        Arbol arbol = new Arbol();
        Node root = arbol.construirArbol(charArray);

        arbol.recorridoInOrder(root);

    }
}
