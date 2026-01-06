public class ReverseString {
    public static void reverseString(StringBuilder s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abhishek"); //there are not put two String
        reverseString(s);
    }
}
