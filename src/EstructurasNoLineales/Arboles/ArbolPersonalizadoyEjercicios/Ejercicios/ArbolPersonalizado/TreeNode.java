package EstructurasNoLineales.Arboles.ArbolPersonalizadoyEjercicios.Ejercicios.ArbolPersonalizado;

import java.util.Comparator;
import java.util.Objects;

public class TreeNode<T extends Comparable<? super T>> {


    private T data;
    private Comparator<T> comparator;
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    TreeNode(T data) {

        this.data = data;
        comparator = null;
    }

    void insert(T value) {

        if (compare(value, data) == 0) {

            System.out.println("Insert failed, tree doesn't accept duplicated values.");
            return;
        }

        if (compare(value, data) < 0) {

            if (leftChild == null) {

                leftChild = new TreeNode<>(value);
            } else {

                leftChild.insert(value);
            }
        } else {

            if (rightChild  == null) {

                rightChild = new TreeNode<>(value);
            } else {

                rightChild.insert(value);
            }
        }
    }

    T min() {

        if (leftChild == null) {

            return data;
        } else {

            return leftChild.min();
        }
    }

    T max() {

        if (rightChild == null) {

            return data;
        } else {

            return rightChild.max();
        }
    }

    TreeNode<T> get(T value) {

        if (compare(value, data) == 0) {

            return this;
        }

        if (compare(value, data) < 0) {

            if (leftChild != null) {

                return leftChild;
            }
        } else {

            if (rightChild != null) {

                return rightChild;
            }
        }

        return null;
    }

    TreeNode<T> delete(TreeNode<T> subTreeRoot, T value) {

        if (subTreeRoot == null) {

            return null;
        }

        if (compare(value, subTreeRoot.data) < 0) {

            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));

        } else if (compare(value, subTreeRoot.data) > 0) {

            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));

        } else {

            if (subTreeRoot.getLeftChild() == null) {

                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {

                return subTreeRoot.getLeftChild();
            }

            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }

    void traversePreOrder() {

        System.out.print("DATA = " + data + " ");

        if (leftChild != null) {

            leftChild.traversePreOrder();
        }

        if (rightChild != null) {

            rightChild.traversePreOrder();
        }
    }

    void traverseInOrder() {

        if (leftChild != null) {

            leftChild.traverseInOrder();
        }

        System.out.print("DATA = " + data + " ");

        if (rightChild != null) {

            rightChild.traverseInOrder();
        }

    }

    void traversePostOrder() {

        if (leftChild != null) {

            leftChild.traversePostOrder();
        }

        if (rightChild != null) {

            rightChild.traversePostOrder();
        }

        System.out.print("DATA = " + data + " ");
    }

    private int compare(T x, T y)
    {
        if (comparator == null) {

            return x.compareTo(y);
        } else {

            return comparator.compare(x, y);
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    private StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {

        if (rightChild != null) {

            rightChild.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }

        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(data.toString()).append("\n");

        if (leftChild != null) {

            leftChild.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }
        return sb;
    }

    @Override
    public String toString() {

        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode<?> treeNode = (TreeNode<?>) o;
        return Objects.equals(getData(), treeNode.getData()) &&
                Objects.equals(getLeftChild(), treeNode.getLeftChild()) &&
                Objects.equals(getRightChild(), treeNode.getRightChild());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getLeftChild(), getRightChild());
    }
}


