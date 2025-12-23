import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>(); //ArrayDeque
       q.add(5);
       q.add(6);
       while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove();
       }
    }
}
