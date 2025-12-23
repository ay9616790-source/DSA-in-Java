import java.util.*;

public class Question390 {

    // FIX 1: add ALL numbers (not only even)
    public static ArrayList<Integer> list(int n){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            l.add(i);
        }
        return l;
    }

    // FIX 2: proper elimination using direction
    public static int lastRemainingElem(ArrayList<Integer> l, boolean leftToRight){

        // base case
        if(l.size() == 1){
            return l.get(0);
        }

        ArrayList<Integer> next = new ArrayList<>();

        if(leftToRight){
            // remove alternate from LEFT
            for(int i = 1; i < l.size(); i += 2){
                next.add(l.get(i));
            }
        } else {
            // remove alternate from RIGHT
            for(int i = l.size() - 2; i >= 0; i -= 2){
                next.add(l.get(i));
            }
            Collections.reverse(next);
        }

        return lastRemainingElem(next, !leftToRight);
    }

    public static void main(String[] args) {
        int n = 1000;
        ArrayList<Integer> arr = list(n);
        System.out.println(lastRemainingElem(arr, true)); // output: 6
    }
}
