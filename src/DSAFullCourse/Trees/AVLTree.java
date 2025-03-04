package DSAFullCourse.Trees;

// AVL Tree implementation
public class AVLTree {
    private Node root;

    private static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1; // Height of node is initialized to 1
        }
    }

    // Get the height of a node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get the balance factor of a node
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate the tree (used for balancing)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate the tree (used for balancing)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a new node into the AVL tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, int data) {
        if (node == null) {
            return new Node(data); // Create a new node if the tree is empty
        }

        // Perform the normal BST insert
        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        } else { // Duplicate values are not allowed
            return node;
        }

        // Update the height of the ancestor node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get the balance factor to check whether the node is unbalanced
        int balance = getBalance(node);

        // Left Left case
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Right Right case
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Left Right case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // Return the (unchanged) node pointer
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);

        System.out.println("Inorder traversal:");
        tree.inorder(); // Print the elements in sorted order
    }
}

/*
  Explanation of AVL Tree:

  - Time Complexity: O(log n) for insertion and balancing, because the tree is kept balanced with each insertion.
  - Space Complexity: O(n) for storing the nodes in the tree.

  - AVL trees perform rotations to ensure the height difference between the left and right subtrees never exceeds 1, thus keeping the tree balanced.
  - The insertRec() method performs the normal BST insertion, then checks for balance and performs rotations if needed.
  - The inorder() method prints the elements in sorted order, just like in a regular BST.
*/
