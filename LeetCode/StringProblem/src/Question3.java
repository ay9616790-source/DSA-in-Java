import java.util.HashSet;

public class Question3 {
    public static int  longestBalanced(String s){
        HashSet<Character> set=new HashSet<>();
        int maxLen=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                count++;
            }else{
                maxLen=Math.max(maxLen,count);
                count=0;
                set.clear();
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str="abbac";
        System.out.print(longestBalanced(str));

    }
}
