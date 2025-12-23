import java.util.Stack;

public class Question71 {

    public static String simplifPath(String path) {
        String[] paths = path.split("/");
        Stack<String> st = new Stack<>();

        for (int i = 0; i < paths.length; i++) {
            String curr = paths[i];

            if (curr.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else if (curr.equals(".") || curr.equals("")) {
                // ignore
            } else {
                st.push(curr);
            }
        }

        StringBuilder s = new StringBuilder();
        while (!st.isEmpty()) {
            s.insert(0, "/" + st.pop());
        }

        if (s.length() == 0) return "/";
        return s.toString();
    }

    public static void main(String[] args) {
        String str = "/home/user/Documents/../Pictures";
        System.out.println(simplifPath(str));  // Output: /home/user/Pictures
    }
}
