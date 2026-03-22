import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Move queue → arraylist
        while (!q.isEmpty()) {
            arr.add(q.remove());
        }

        // Reverse first k elements
        for (int i = k-1 ; i >= 0; i--) {
            q.add(arr.get(i));
        }

        // Add remaining elements
        for (int i = k; i < arr.size(); i++) {
            q.add(arr.get(i));
        }

        return q;

    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;

        System.out.println(reverseFirstK(q,k));
    }
}
