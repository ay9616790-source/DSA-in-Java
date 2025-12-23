import java.util.Stack;

public class Question1047 {
    public  static String removeDuplicates(String str){
       Stack<Character> s=new Stack<>();
       for(int i=0;i<str.length();i++){
           if(!s.isEmpty() && s.peek()==str.charAt(i)){
               s.pop();
           }else{
               s.push(str.charAt(i));
           }
       }
       StringBuilder ans=new StringBuilder();
       while (!s.isEmpty()){
           ans.append(s.pop());
       }
       return ans.reverse().toString();

    }
    public static void main(String[] args) {
        String str="abbaca";
        System.out.println(removeDuplicates(str));
    }
}
