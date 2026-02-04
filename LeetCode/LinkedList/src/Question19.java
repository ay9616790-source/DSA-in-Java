import java.util.LinkedList;

public class Question19 {

    public static LinkedList<Integer> removeNthFromEnd(LinkedList<Integer> ll, int n) {
        int size = ll.size();

        if (n > size) {
            return ll; // invalid case
        }

        int indexToRemove = size - n;
        ll.remove(indexToRemove);

        return ll;
    }

    public static void main(String[] args) {
        // Input: head = [1,2,3,4,5], n = 2
        // Output: [1,2,3,5]

        int n = 2;
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(removeNthFromEnd(ll, n));
    }
}
