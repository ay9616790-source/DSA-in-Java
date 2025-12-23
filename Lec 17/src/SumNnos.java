public class SumNnos {
    public static int CalSum(int n){
        if(n==1){
            return 1;
        }
        return n+CalSum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        CalSum(n);
        int result = CalSum(n);
        System.out.println(result);

    }
}
