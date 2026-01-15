import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question1700 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();

        for (int s : students) {
            q.add(s);
        }

        int i = 0;          // index for sandwiches
        int rotations = 0; // count unsuccessful attempts

        while (!q.isEmpty() && rotations < q.size()) {
            if (q.peek() == sandwiches[i]) {
                q.poll();   // student takes sandwich
                i++;        // move to next sandwich
                rotations = 0;
            } else {
                q.add(q.poll()); // move student to back
                rotations++;
            }
        }

        return q.size(); // students left unable to eat
    }

    public static void main(String[] args) {
        int []students = {1,1,0,0};
        int []sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
