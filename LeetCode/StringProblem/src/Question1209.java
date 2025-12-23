import java.util.Stack;

public class Question1209 {
    static class Pair{
        char chr;
        int freq;
        Pair(char chr,int freq){
            this.chr=chr;
            this.freq=freq;
        }
    }
    public  static String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek().chr==ch){
                st.peek().freq++;
                if(!st.isEmpty() && st.peek().freq==k){
                    st.pop();
                }
            }else {
                Pair p=new Pair(ch,1);
                    st.push(p);
                }
            }


        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            int freq=st.peek().freq;
            char ch=st.peek().chr;
            st.pop();
            for(int i=0;i<freq;i++){
                ans.append(ch);
            }
        }
        return ans.reverse().toString();

    }
    public static void main(String[] args) {
       String str="abcccd";
        System.out.println(removeDuplicates(str,3));
    }
}
