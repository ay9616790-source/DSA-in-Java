public class fact {
    public static int calculterFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }return n*calculterFactorial(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        int result=calculterFactorial(n);
        System.out.println(result);
    }
}
