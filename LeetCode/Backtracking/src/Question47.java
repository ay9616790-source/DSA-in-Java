import java.util.*;
public class Question47 {
    public static String Permutation(List<List<Character>> list,ArrayList<Character> temp,String str,int k){
         if(temp.size()==str.length()){
             list.add(new ArrayList<>(temp));
         }
         for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             if(temp.contains(ch)) continue;
             temp.add(ch);
             Permutation(list,temp,str,k);
             temp.remove(temp.size()-1);

         }
         return list.get(k).toString();
    }
    public static void main(String[] args) {
        int n=3;
        int k=3;
        String str="";
        for(int i=1;i<=n;i++){
            str=str+i;
        }
        List<List<Character>> list=new ArrayList<>();
        ArrayList<Character> temp=new ArrayList<>();
        Permutation(list,temp,str,k);

    }
}
