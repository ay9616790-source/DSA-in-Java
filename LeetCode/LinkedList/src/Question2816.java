public class Question2816 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node doubleIt(Node head) {
        if (head == null) return null;

        int val = 0;              // 🔹 changed int → long
        Node temp = head;

        // Convert linked list to number
        while (temp != null) {
            val = val * 10 + temp.data;
            temp = temp.next;
        }

        val = val * 2;

        // Create new linked list from digits
        Node newHead = null;

        if (val == 0) return new Node(0);

        while (val > 0) {
            int digit = (int)(val % 10);
            if(val>Integer.MAX_VALUE/10 ||
                    (val==Integer.MAX_VALUE/10 && digit>7)){

                return newHead;
            }
            if(val<Integer.MIN_VALUE/10||
                    (val==Integer.MIN_VALUE/10  && digit>-8)){
                return newHead;
            }// 🔹 cast to int
            Node newNode = new Node(digit);

            newNode.next = newHead;
            newHead = newNode;

            val /= 10;
        }

        return newHead;
    }

    // Print helper
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(8);
        head.next.next = new Node(9);

        Node result = doubleIt(head);
        printList(result);
    }
}
