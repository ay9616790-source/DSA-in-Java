import java.util.*;
public class Compalint {
    public static int comp(int n){
        ArrayList<Integer> result=new ArrayList<>();
        while(n>0){
            int rem=n%2;
            if(rem==0){
                rem=1;
            }else{
                rem=0;
            }
            result.add(rem);
           n/=2;
        }
        int ans=0;
        for(int i=0;i<result.size();i++){
            ans+=result.get(i)*Math.pow(2,i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(comp(n));

    }
}
