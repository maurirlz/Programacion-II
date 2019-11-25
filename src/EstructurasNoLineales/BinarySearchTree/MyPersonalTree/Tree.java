package EstructurasNoLineales.BinarySearchTree.MyPersonalTree;

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
}
