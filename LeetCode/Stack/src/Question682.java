import java.util.Stack;

public class Question682 {
    public static int calPoints(String[] operations){


                Stack<Integer> st = new Stack<>();

                for (int i = 0; i < operations.length; i++) {
                    String op = operations[i];

                    if (op.equals("C")) {
                        // Invalidate last score
                        if (!st.isEmpty()) st.pop();
                    } else if (op.equals("D")) {
                        // Double last score
                        if (!st.isEmpty()) st.push(st.peek() * 2);
                    } else if (op.equals("+")) {
                        // Sum of last two scores
                        int top = st.pop();
                        int newTop = top + st.peek();
                        st.push(top);      // push back the popped value
                        st.push(newTop);   // push the sum
                    } else {
                        // It's a number
                        st.push(Integer.parseInt(op));
                    }
                }

                // Sum all scores
                int sum = 0;
                for (int score : st) {
                    sum += score;
                }
                return sum;
            }




    public static void main(String[] args) {
        String[] s={"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
}
