public class Question744 {
    public static char nextGreatestLetter(char[] letters, char target) {

                for (char ch : letters) {
                    if (ch > target) {
                        return ch;
                    }
                }
                return letters[0];

    }
    public static void main(String[] args) {
        char[] ch={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(ch,target));
    }
}
