package EstructurasNoLineales.BinarySearchTree.MyPersonalTree;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> intTree = new Tree<>();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);



        // expected: 15, 20, 22, 25, 26, 27, 29, 30, 32
        // result: 15, 22, 20, 25, 26, 29, 32, 30, 27

        /*TreeNode<Integer> test = intTree.get(25);*/

        intTree.printLevels();
    }
}
