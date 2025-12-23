import java.util.ArrayList;

public class ClimingStairs {
    public static int print(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }
        int count=1;
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.size();j++){
                if(ans.get(i)+ ans.get(j)==n){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(print(n));
    }
}
