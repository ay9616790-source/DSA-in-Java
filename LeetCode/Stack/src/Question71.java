import java.util.*;
public class Question71 {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();   // Character → String
        StringBuilder str = new StringBuilder();
        String[] p = path.split("/");

        // path.length() → p.length
        for (int i = 0; i < p.length; i++) {
            if (!s.isEmpty() && p[i].equals(".."))
                s.pop();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }

        if (s.isEmpty())
            return "/";

        while (!s.isEmpty()) {
            str.insert(0, s.pop()).insert(0, "/");
        }
        return str.toString();
    }
    public static void main(String[] args) {
       String path = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path));
    }
}
