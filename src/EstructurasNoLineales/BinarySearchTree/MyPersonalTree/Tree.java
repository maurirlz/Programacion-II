package EstructurasNoLineales.BinarySearchTree.MyPersonalTree;

import EstructurasLineales.Queue.MyPersonalQueue.MyQueue;

class Tree<T extends Comparable<? super T>> {

    private TreeNode<T> root;

    void insert(T value) {

        if (root == null) {

            root = new TreeNode<>(value);
        } else {

            root.insert(value);
        }
    }

    T min() {

        if (root == null) {

            return null;
        } else {

            return root.min();
        }
    }

    T max() {

        if (root == null) {

            return null;
        } else {

            return root.max();
        }
    }

    TreeNode<T> get(T value) {

        if (root != null) {

            return root.get(value);
        }

        return null;
    }

    void delete(T value) {

        root.delete(root, value);
    }


    void traversePreOrder() {

        if (root != null) {

            root.traversePreOrder();
        }
    }

    void traverseInOrder() {

        if (root != null) {

            root.traverseInOrder();
        }
    }

    void traversePostOrder() {

        if (root != null) {

            root.traversePostOrder();
        }
    }

    void printLevels() {

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
