import java.util.Locale;
import java.util.Stack;

public class Question1544 {
    public static String makeGood(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.pop());
        }

        return str.reverse().toString();

    }
    public static void main(String[] args) {
        String s="Pp";
        System.out.println(makeGood(s));
    }
}
