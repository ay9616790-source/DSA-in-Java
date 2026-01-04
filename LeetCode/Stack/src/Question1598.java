import java.util.*;
public class Question1598 {
    public static int minOperations(String[] logs){
        Stack<String> s = new Stack<>();

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!s.isEmpty()) s.pop();
            }
            else if (!logs[i].equals("./")) {
                s.push(logs[i]);
            }
        }

        return s.size();
    }
    public static void main(String[] args) {
        String [] logs={"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }
}
