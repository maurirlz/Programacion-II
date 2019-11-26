package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.Ejercicio3;

public class Node {

    private Node left;
    private Node right;
    private char data;

    public Node(char data) {

        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public char getData() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
