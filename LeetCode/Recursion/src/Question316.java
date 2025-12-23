public class Question316 {
    public static String removeDuplicate(String s) {
        boolean[] map = new boolean[26];
        return helper(s, 0, map, new StringBuilder());
    }

    private static String helper(String s, int idx, boolean[] map, StringBuilder newStr) {
        // Base case
        if (idx == s.length()) {
            return newStr.toString();
        }

        char currChar = s.charAt(idx);

        // If character is already seen → skip it
        if (map[currChar - 'a']) {
            return helper(s, idx + 1, map, newStr);
        }
        // If not seen → add to string and mark true
        else {
            newStr.append(currChar);
            map[currChar - 'a'] = true;
            return helper(s, idx + 1, map, newStr);
        }
    }

    public static void main(String[] args) {
        String s= "cbacdcbc";
        removeDuplicate(s);
    }
}
