public class Question955 {


    public static int minDeletionSize(String[] strs) {
        int m = strs.length;       // number of strings
        int n = strs[0].length();  // length of each string
        int count = 0;

        // check each column
        for (int col = 0; col < n; col++) {
            for (int row = 1; row < m; row++) {
                if(strs[row].charAt(col) < strs[row - 1].charAt(col))
               {
                    count++; // column not sorted
                    break;   // move to next column
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String [] str={"xc","yb","za"};
        System.out.println(minDeletionSize(str));
    }
}
