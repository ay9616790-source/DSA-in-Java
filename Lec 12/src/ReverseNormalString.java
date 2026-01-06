public class ReverseNormalString {

        public static void reverseString(String s) {
            char[] chars = s.toCharArray(); // convert string to char array
            int i = 0, j = chars.length - 1;

            while (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }

            // convert back to string
            String reversed = new String(chars);
            System.out.println(reversed);
        }

        public static void main(String[] args) {
            String s = "Abhishek";
            reverseString(s);
        }
    }


