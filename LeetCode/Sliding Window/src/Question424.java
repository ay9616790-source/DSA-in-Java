public class Question424 {

    public static int characterReplacement(String s, int k) {

        int maxCount = 0;

        for(int i = 0; i < s.length(); i++){

            int changes = 0;

            for(int j = i; j < s.length(); j++){

                if(s.charAt(j) != s.charAt(i)){
                    changes++;
                }

                if(changes > k){
                    break;
                }

                maxCount = Math.max(maxCount, j - i + 1);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement(s,k));
    }
}