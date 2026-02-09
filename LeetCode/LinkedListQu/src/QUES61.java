
public class QUEST61 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Rotate Linked List Right by k
    public static Node rotateLL(Node head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        Node temp = head;
        int len = 1;

        // find length and last node
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        // make circular
        temp.next = head;

        // move to new tail
        for (int i = 0; i < len - k; i++) {
            temp = temp.next;
        }

        Node newHead = temp.next;
        temp.next = null;   // break circle

        return newHead;
    }

    // Print Linked List
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printLL(head);

        int k = 2;
        head = rotateLL(head, k);

        System.out.println("After Rotation by " + k + ":");
        printLL(head);
    }
}  this code is correct