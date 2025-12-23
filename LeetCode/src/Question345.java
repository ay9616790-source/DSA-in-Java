public class Question345 {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            // Move i forward until a vowel is found
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // Move j backward until a vowel is found
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }

            // Swap the vowels
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseString(s)); // Output: "AceCreIm"
    }
}
