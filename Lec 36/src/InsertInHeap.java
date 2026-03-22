import java.util.ArrayList;

public class InsertInHeap {

    static class Heap {
        ArrayList<Integer> ll = new ArrayList<>();

        public void add(int data) {
            ll.add(data);                 // insert at last index
            int x = ll.size() - 1;        // child index

            while (x > 0) {
                int par = (x - 1) / 2;    // parent index

                if (ll.get(x) < ll.get(par)) {
                    // swap
                    int temp = ll.get(x);
                    ll.set(x, ll.get(par));
                    ll.set(par, temp);

                    x = par;              // 🔑 move up
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);

        System.out.println(h.ll); // [2, 5, 20, 10]
    }
}
