public class CycleLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // list empty
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        head = new CycleLinkedList.Node(1);
        Node temp = new CycleLinkedList.Node(2);
        head.next = temp;
        head.next.next = new CycleLinkedList.Node(3);
        head.next.next.next = temp; // create cycle

        System.out.println("Cycle detected? " + isCycle());
    }
}
