package BinaryTree;

import java.util.List;

public class Tree implements TreeServiceInterface {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public Tree() {
        root = null;
    }

    @Override
    public Node find(int key) {

        Node current = root;

        while (current.data != key) {

            if (key < current.data)
                current = current.leftChild;
            else
                current = current.rightChild;

            if (current == null)
                return null;
        }

        return current;
    }

    @Override
    public void insert(int key) {

        Node newNode = new Node();
        newNode.data = key;

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node previousOfCurrent;


        while (true) {
            previousOfCurrent = current;

            if (key < current.data) {

                current = current.leftChild;

                if (current == null) {
                    previousOfCurrent.leftChild = newNode;
                    return;
                }
            } else {

                current = current.rightChild;

                if (current == null) {
                    previousOfCurrent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    @Override
    public boolean delete(int key) {

        return false;
    }

    @Override
    public void traverse_preOrder(Node localRoot) {

        if (localRoot != null) {
            System.out.println(localRoot.data);
            traverse_preOrder(localRoot.leftChild);
            traverse_preOrder(localRoot.rightChild);
        }

    }

    @Override
    public void traverse_InOrder(Node localRoot) {

        if (localRoot != null) {
            traverse_InOrder(localRoot.leftChild);
            System.out.println(localRoot.data);
            traverse_InOrder(localRoot.rightChild);
        }

    }

    @Override
    public void traverse_postOrder(Node localRoot) {

        if (localRoot != null) {
            traverse_postOrder(localRoot.leftChild);
            traverse_postOrder(localRoot.rightChild);
            System.out.println(localRoot.data);
        }

    }

    @Override
    public void displayTree() {

    }

    @Override
    public Node findMaximum() {

        Node current = root;
        Node previousOfCurrent;

        while (current != null) {
            previousOfCurrent = current;

            current = current.rightChild;

            if (current == null) {
                return previousOfCurrent;
            }
        }

        return null;
    }

    @Override
    public Node findMinimum() {
        Node current = root;
        Node previousOfCurrent = null;

        while (current != null) {
            previousOfCurrent = current;
            current = current.leftChild;
        }
        return previousOfCurrent;
    }

    @Override
    public boolean isSymmetric(Node node) {

        //https://leetcode.com/problems/symmetric-tree/submissions/

        // https://www.youtube.com/watch?v=-5E5Jt_HKLc&ab_channel=NickWhite

        return isMirror(node, node);

    }

    private boolean isMirror(Node t1, Node t2) {

        if (t1 == null && t2 == null) return true;

        if (t1 == null || t2 == null) return false;

        return (t1.data == t2.data) && isMirror(t1.leftChild, t2.rightChild) && isMirror(t1.rightChild, t2.leftChild);

    }

    public int maximumDepth(Node node) {
       // https://www.youtube.com/watch?v=D2cFSDfg0So&ab_channel=KevinNaughtonJr.
        if (node == null){
            return 0;
        }

        int leftDepth = maximumDepth(node.leftChild);
        int rightDepth = maximumDepth(node.rightChild);

        return Math.max(leftDepth, rightDepth) +1;
    }


}
