import  java.util.*;
public class Question60 {
    public static StringBuilder  getPermutation(int n, int k){
        List<Integer> numbers = new ArrayList<>();

        for(int i=1;i<n;i++){
            numbers.add(i);
        }
          StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ans.append(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        int k=3;
        System.out.println(getPermutation(n,k));
    }
}
