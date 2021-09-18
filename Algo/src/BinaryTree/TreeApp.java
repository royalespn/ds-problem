package BinaryTree;

public class TreeApp {

    public static void main(String[] args){

        Tree tree = new Tree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(10);
        tree.insert(2);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);



        Node find = tree.find(20);

        if(find != null) {
            System.out.println("Found : "+find.data);
        }

        Node find1 = tree.find(19);

        if(find1 != null) {
            System.out.println("Found : "+find1.data);
        } else {
            System.out.println("Not Found : "+ 19);
        }

        System.out.println("In-Order-traversal");
        tree.traverse_InOrder(tree.getRoot());

        System.out.println("In-Order-traversal");
        tree.traverse_preOrder(tree.getRoot());

        System.out.println("Post-Order-traversal");
        tree.traverse_postOrder(tree.getRoot());

        System.out.println("The maximim value: " + tree.findMaximum().data);
        System.out.println("The min value: " + tree.findMinimum().data);
    }

}
