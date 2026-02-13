import java.util.HashMap;
import java.util.HashSet;

public class Question3713 {
    public static int longestBalanced(String s){
        int maxlen=0;

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           int count=0;
           for(int j=i;j<s.length();j++){
               if(ch!=s.charAt(i)){

               }else{

               }
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        String s="zzabccy";
        System.out.println(longestBalanced(s));
    }
}
