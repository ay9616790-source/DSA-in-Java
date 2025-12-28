import java.util.Stack;

public class Question844 {
    public static boolean  backspaceCompare(String s, String t) {
        Stack<Character> st1 = (buildStack(s));
        Stack<Character> st2 = (buildStack(t));
        return st1.equals(st2);
    }
        private static Stack<Character> buildStack(String str){
            Stack<Character> st=new Stack<>();
            for(char ch:str.toCharArray()){
                if(ch=='#'){
                    if(!st.isEmpty()) st.pop();
                }else {
                    st.push(ch);
                }
            }
            return st;
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}
