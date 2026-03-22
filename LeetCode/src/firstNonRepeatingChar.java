import java.util.*;

public class firstNonRepeatingChar {
    public static String firstNonRepeating(String s) {
        StringBuilder result = new StringBuilder();
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(char ch:s.toCharArray()){
            freq[ch - 'a']++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }
            if(q.isEmpty()){
                result.append('#');
            }else{
                result.append(q.peek());
            }
        }

//        for (char ch : s.toCharArray()) {
//            freq[ch - 'a']++;
//            q.add(ch);
//
//            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                q.poll();
//            }
//
//            if (q.isEmpty())
//                result.append('#');
//            else
//                result.append(q.peek());
//        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("zzz"));   // z##
        System.out.println(firstNonRepeating("aabc"));  // a#bb
    }
}