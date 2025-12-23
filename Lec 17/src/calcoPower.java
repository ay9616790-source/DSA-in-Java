public class calcoPower {
    public static int findPower(int x,int n){
        if(n==0){
            return 1;
        }if(x==0){
            return 0;
        }
        int Power=findPower(x,n-1);
        int xPow=x*Power;
        return xPow;
    }

    public static void main(String[] args) {
        int x=2;int n=5;
        int result=findPower(x,n);
        System.out.println(result);
    }
}
