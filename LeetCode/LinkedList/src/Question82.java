public class Question82 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node duplicate(Node head) {
        if (head == null) return null;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node temp = head;

        while (temp != null) {
            if (temp.next != null && temp.data == temp.next.data) {
                int dupValue = temp.data;
                while (temp != null && temp.data == dupValue) {
                    temp = temp.next;
                }
                prev.next = temp; // skip all duplicates
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Build custom linked list: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        Node result = duplicate(head);

        System.out.println("After removing duplicates:");
        printList(result);
    }
}
