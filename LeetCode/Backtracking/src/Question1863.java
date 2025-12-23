import java.util.ArrayList;

public class Question1863 {

    static int totalSum = 0;

    public static void subsets(int[] arr, ArrayList<Integer> list, int i) {

        if (i == arr.length) {
            int xor = 0;

            // calculate XOR of this subset
            for (int j = 0; j < list.size(); j++) {
                xor ^= list.get(j);
            }

            System.out.println(list + " XOR = " + xor);

            totalSum += xor;
            return;
        }

        // include element
        ArrayList<Integer> include = new ArrayList<>(list);
        include.add(arr[i]);
        subsets(arr, include, i + 1);

        // exclude element
        subsets(arr, list, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 6};

        subsets(arr, new ArrayList<>(), 0);

        System.out.println("Total XOR Sum of all subsets = " + totalSum);
    }
}
