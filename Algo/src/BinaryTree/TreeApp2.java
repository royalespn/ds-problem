package BinaryTree;

public class TreeApp2 {

    public static void main(String[] args){

        Tree tree = new Tree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(10);




        System.out.println("In-Order-traversal");
        tree.traverse_InOrder(tree.getRoot());

        System.out.println("The maximim value: " + tree.findMaximum().data);
        System.out.println("The min value: " + tree.findMinimum().data);

        System.out.println("Is symmetrical " + tree.isSymmetric(tree.getRoot()));
    }

}
