package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.ArbolPersonalizado;

import EstructurasLineales.Queue.MyPersonalQueue.MyQueue;

public class Tree<T extends Comparable<? super T>> {

    private TreeNode<T> root;

    public void insert(T value) {

        if (root == null) {

            root = new TreeNode<>(value);
        } else {

            root.insert(value);
        }
    }

    public T min() {

        if (root == null) {

            return null;
        } else {

            return root.min();
        }
    }

    public T max() {

        if (root == null) {

            return null;
        } else {

            return root.max();
        }
    }

    public TreeNode<T> get(T value) {

        if (root != null) {

            return root.get(value);
        }

        return null;
    }

    public void delete(T value) {

        root.delete(root, value);
    }


    public void traversePreOrder() {

        if (root != null) {

            root.traversePreOrder();
        }
    }

    public void traverseInOrder() {

        if (root != null) {

            root.traverseInOrder();
        }
    }

    public void traversePostOrder() {

        if (root != null) {

            root.traversePostOrder();
        }
    }

    public void printLevels() {

        MyQueue<TreeNode> queue = new MyQueue<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            TreeNode aux = queue.dequeue();
            System.out.println(aux.getData() + " ");

            if (aux.getLeftChild() != null) {

                queue.enqueue(aux.getLeftChild());
            }

            if (aux.getRightChild() != null) {

                queue.enqueue(aux.getRightChild());
            }
        }
    }

    @Override
    public String toString() {

        if (root != null) {
            return root.toString();

        }

        return null;
    }
}
