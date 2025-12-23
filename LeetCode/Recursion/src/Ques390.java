import java.util.ArrayList;

public class Ques390 {

    public static int list(int n) {

        boolean leftToRigth = false;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i += 2) {
            list.add(i);
        }

        while (list.size() > 1) {

            if (leftToRigth) {
                // Left → Right
                for (int i = list.size() - 1; i >= 0; i -= 2) {
                    list.remove(i);
                }
            } else {
                // Right → Left
                for (int i = list.size() - 2; i >= 0; i -= 2) {
                    list.remove(i);
                }
            }

            leftToRigth = !leftToRigth;
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(list(n));
    }
}
