import java.util.Stack;

public class Question2390 {
    public static String removeStars(String s){
        Stack<Character> st=new Stack<>();
        int count=0;

       for(int i=0;i<s.length();i++){

           if(s.charAt(i)=='*'){
               count++;
               while(count!=0 && !st.isEmpty()){

                   st.pop();
                   count--;
               }
           }else{
               st.push(s.charAt(i));
           }
       }
       StringBuilder ans=new StringBuilder();
       while(!st.isEmpty()){
           ans.insert(0,st.pop());
       }
   return ans.toString();
    }
    public static void main(String[] args) {
        String s="Leet**cod*e";
        System.out.println(removeStars(s));
    }
}
