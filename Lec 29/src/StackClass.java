import java.util.ArrayList;

public class StackClass {

    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push element
        public void push(int data) {
            list.add(data);
        }

        // Pop element
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // or throw exception
            }
            return list.remove(list.size() - 1);
        }

        // Peek top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // or throw exception
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            System.out.println("Popped: " + s.pop());
        }
    }
}
