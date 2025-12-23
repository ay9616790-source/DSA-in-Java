import java.util.Stack;

public class StatckImplByCollection {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(6);
        s.push(9);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
