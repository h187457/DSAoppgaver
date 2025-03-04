package DSAFullCourse.Iterator;

// Linked List with Iterator implementation
public class LinkedListIterator {
    private Node head; // Head node of the linked list

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedListIterator() {
        head = null;
    }

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Add the new node to the end
        }
    }

    // Iterator method to return the first node
    public Node iterator() {
        return head;
    }

    public static void main(String[] args) {
        LinkedListIterator list = new LinkedListIterator();
        list.add(10); // Add 10 to the list
        list.add(20); // Add 20 to the list
        list.add(30); // Add 30 to the list

        Node current = list.iterator();
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of each node
            current = current.next; // Move to the next node
        }
    }
}

/*
  Explanation of Iterators for Linked List:

  - The `LinkedListIterator` class allows us to traverse the linked list starting from the head node.
  - The `iterator()` method returns the head node, which we use in a loop to access each subsequent node.
  - This is similar to how an iterator would work with other collections like ArrayList, but here it is specific to a linked list.
  - The iteration helps us access each element in the collection without exposing the internal structure of the list.
*/
