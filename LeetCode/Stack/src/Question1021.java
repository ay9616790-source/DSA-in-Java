import java.util.Stack;

public class Question1021 {
    public static String removeOuterParentheses(String s){
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
           if(ch=='('){
               if(!st.isEmpty()){
                   str.append(ch);
               }
               st.push(ch);
           }else{
               st.pop();
               if(!st.isEmpty()){
                   str.append(ch);
               }
           }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str="(()())(())";
        System.out.println(removeOuterParentheses(str));
    }
}
