import java.util.Stack;

public class Question693 {
    public static boolean hasAlternatingBits(int n){
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return false;
            }

        }
//        while(n!=0){
//            s=s+n%2;
//            n=n/2;
//        }
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<s.length();i++){
//            if(!st.isEmpty() && st.peek()==s.charAt(i)){
//                return false;
//            }else{
//                st.push(s.charAt(i));
//            }
//        }
//        return true;
        return true;
    }
    public static void main(String[] args) {
     int n=11;
        System.out.println(hasAlternatingBits(n));
    }
}

