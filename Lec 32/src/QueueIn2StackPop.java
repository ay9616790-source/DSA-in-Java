import java.util.Stack;

public class QueueIn2StackPop {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // O(1)
        public static void add(int data) {
            s1.push(data);
        }

        // O(n) costly pop
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // move all from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // peek element
        public static int peek() {
            if (isEmpty()) return -1;

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
