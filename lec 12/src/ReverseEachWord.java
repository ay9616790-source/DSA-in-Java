import com.sun.security.jgss.GSSUtil;

public class ReverseEachWord {
    public static String reverseword(String s){
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word : words){
            StringBuilder ab=new StringBuilder(word);
            ab.reverse();
            result.append(ab).append(" ");
        }
        return result.toString().trim();

    }
    public static void main(String[] args) {
        String s = "Bishal is a bad boy";
        System.out.println(reverseword(s));
    }
}
