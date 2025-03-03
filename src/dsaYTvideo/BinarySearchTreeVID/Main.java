package dsaYTvideo.BinarySearchTreeVID;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(6));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(3));
        tree.insert(new Node(8));

        tree.display();
    }
}
