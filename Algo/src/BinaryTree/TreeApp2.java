package BinaryTree;

public class TreeApp2 {

    public static void main(String[] args){

        Tree tree = new Tree();

        tree.insert(1);
        tree.insert(0);
        tree.insert(2);


        System.out.println("In-Order-traversal");
        tree.traverse_InOrder(tree.getRoot());

        System.out.println("The maximim value: " + tree.findMaximum().data);
        System.out.println("The min value: " + tree.findMinimum().data);

        System.out.println("Is symmetrical " + tree.isSymmetric(tree.getRoot()));
        System.out.println("Max depth: " + tree.maximumDepth(tree.getRoot()));

        System.out.println("Breadth First Search " + tree.breadthFirstSearch(tree.getRoot()));

        System.out.println("Level Order Traversal " + tree.levelOrderTraversal(tree.getRoot()));

        System.out.println("Right Side Traversal " + tree.rightSideView(tree.getRoot()));


        Tree treeP = new Tree();
        treeP.insert(0);

        Tree treeQ = new Tree();
        treeQ.insert(2);

        System.out.println("Lowest common ancestor  " + tree.lowestCommonAncestor(tree.getRoot(), treeP.getRoot(),treeQ.getRoot()));


        System.out.println("Binary search tree  " + tree.searchBST(tree.getRoot(), 1));


        System.out.println("sorted array to BST  " + tree.sortedArrayToBST(new int[]{1,2,3,4}));




    }

}
