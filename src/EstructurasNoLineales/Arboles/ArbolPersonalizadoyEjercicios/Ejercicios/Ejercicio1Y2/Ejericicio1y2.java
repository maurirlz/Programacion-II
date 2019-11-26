package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.Ejercicio1Y2;

import EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.ArbolPersonalizado.Tree;

public class Ejericicio1y2 {

    public static void main(String[] args) {

        Tree<Integer> intTree = new Tree<>();

        intTree.insert(4);
        intTree.insert(2);
        intTree.insert(5);
        intTree.insert(6);
        intTree.insert(1);
        intTree.insert(3);

        System.out.println(intTree.toString()); // ejercicio 1
        intTree.printLevels(); // ejercicio 2
    }
}
