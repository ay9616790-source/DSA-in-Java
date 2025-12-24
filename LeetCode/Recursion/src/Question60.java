import java.util.*;

public class Question60 {
    public static String getPermutation(List<String> result, StringBuilder temp, boolean[] used, int n) {
        if (temp.length() == n) {
            result.add(temp.toString());
            return result.toString();
        }
        for (int i = 1; i <= n; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.append(i);
            getPermutation(result, temp, used, n);
            temp.deleteCharAt(temp.length() - 1); // backtrack
            used[i] = false;
        }
        return result.toString();

    }

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        boolean[] used = new boolean[n + 1]; // track used numbers

        System.out.println(getPermutation(result, temp, used, n));

        System.out.println("All permutations: " + result);
        System.out.println(k + "th permutation: " + result.get(k - 1));
    }
}
