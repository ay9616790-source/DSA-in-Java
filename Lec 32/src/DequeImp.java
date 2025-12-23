import java.util.*;

public class DequeImp {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        d.add(5);
        d.remove();
        d.removeFirst();
        d.removeLast();
        System.out.print(d+" ");
        System.out.println(" First elem"+d.getFirst()+" ");
        System.out.println(" last elem"+d.getLast());
    }
}
