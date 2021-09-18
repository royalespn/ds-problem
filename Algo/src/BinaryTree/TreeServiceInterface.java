package BinaryTree;

public interface TreeServiceInterface {

    Node find(int key);

    void insert(int key);

    boolean delete(int key);

    void traverse_preOrder(Node localRoot);

    void traverse_InOrder(Node localRoot);

    void traverse_postOrder(Node localRoot);

    void displayTree();

    Node findMaximum();

    Node findMinimum();

    boolean isSymmetric(Node node);
}
