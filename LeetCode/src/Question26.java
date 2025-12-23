public class Question26 {
    public static int countDuplicates(int[] n) {
        int count = 1;

        if (n.length == 0) {
            return 0;
        }

        for (int i = 1; i < n.length ; i++) {
            if (n[i] != n[i-1]) {
                n[count]=n[i];
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("Number of duplicates: " + countDuplicates(nums));
    }
}
