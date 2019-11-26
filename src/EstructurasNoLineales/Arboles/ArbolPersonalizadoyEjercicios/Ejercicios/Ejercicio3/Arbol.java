package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.Ejercicio3;

import EstructurasLineales.Stack.*;

public class Arbol {

    boolean esOperador(char caracter) {

        return (caracter == '+' || caracter == '-'
                || caracter == '*' || caracter == '/' ||
                caracter == '^');
    }

    public void recorridoInOrder(Node nodo) {

        if (nodo.getLeft() != null) {

            recorridoInOrder(nodo.getLeft());
        }

        System.out.print(nodo.getData() + " ");

        if (nodo.getRight() != null) {

            recorridoInOrder(nodo.getRight());
        }
    }

    public Node construirArbol(char[] anotacionPrefija) {

        Stack<Node> stack = new Stack<>();
        Node aux, aux2 = null, aux3;

        for (int i = 0; i < anotacionPrefija.length; i++) {

            if (!esOperador(anotacionPrefija[i])) {

                aux = new Node(anotacionPrefija[i]);
                stack.push(aux);
            } else {

                aux = new Node(anotacionPrefija[i]);


                aux2 = stack.pop();
                aux3 = stack.pop();

                aux.setRight(aux2);
                aux.setLeft(aux3);


                stack.push(aux);
            }
        }
        aux = stack.pop();

        return aux;
    }
}
