package DSAFullCourse.Trees;

// Binary Search Tree implementation
public class BinarySearchTree {
    private Node root; // Root node of the tree

    private static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a new node into the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive function to insert a new node
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data); // If the tree is empty, create a new node
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data); // Insert in the left subtree
        } else if (data > root.data) {
            root.right = insertRec(root.right, data); // Insert in the right subtree
        }

        return root;
    }

    // Inorder traversal (left, root, right)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left); // Traverse left subtree
            System.out.print(root.data + " "); // Print the node
            inorderRec(root.right); // Traverse right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal:");
        bst.inorder(); // Print the elements in sorted order
    }
}

/*
  Explanation of Binary Search Tree:

  - Time Complexity:
    - Insertion: O(log n) on average, but O(n) in the worst case (if the tree is unbalanced).
    - Traversal (Inorder): O(n), as we visit each node once.

  - A Binary Search Tree (BST) maintains the property that for any node, the left subtree contains smaller values, and the right subtree contains larger values.
  - The insert() method recursively finds the correct position for the new node.
  - The inorder() method prints the elements in sorted order because it first visits the left child, then the current node, and then the right child.
*/
