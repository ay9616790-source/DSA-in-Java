import java.util.Stack;

public class Question227 {
    public static int BasicCalculator(String str){
        Stack<Character> s=new Stack<>();
        int n=str.length();
//        int arr[n];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='*'|| ch=='/' ||ch=='+'||ch=='-'){
                s.push(ch);
            }else{
//                arr[i]=ch;
            }
        }
         return 0;
    }
    public static void main(String[] args) {
        String s= "3+2*2";
    }
}
