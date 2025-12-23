public class ImplatationByArray {
    static class Queue {
        int[] arr;
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;   // FIXED: you wrote arr[rear] = rear
        }

        // Remove
        public int remove() {   // FIXED: remove should NOT take data
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];

            // shift elements left
            for (int i = 0; i < rear; i++) {   // FIXED: loop goes to rear, not arr.length
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.add(9);
        q.add(8);
        q.add(7);
        q.add(6);
        q.remove();
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
