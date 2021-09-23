package BinaryTree;

public class Node {

    public int data;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.println('{' + data + '}');
    }

    @Override
    public String toString() {
        return data+"";
    }
}

