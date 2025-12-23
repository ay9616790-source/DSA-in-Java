import java.util.Stack;

public class Question394 {
    public static String Print(String s){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=']'){
                st.push(ch);
            }else{
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb.insert(0,st.pop());
                }
                String toRepated= sb.toString();
                st.pop();
                sb=new StringBuilder();
                while (!st.isEmpty() && st.peek()>='0' && st.peek()<='9'){
                    sb.insert(0,st.pop());
                }
                int count=Integer.parseInt(sb.toString());
                while(count>0){
                    for(int j=0;j<toRepated.length();j++){
                        char  chr=toRepated.charAt(j);
                        st.push(chr);

                    }
                    count--;
                }
            }

        }
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(Print(s));
    }
}
