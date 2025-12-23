public class Factorial {
    public static int  calculterFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_num1=calculterFactorial(n-1);
        int fact_n=n*fact_num1;
        return fact_n;
    }

    public static void main(String[] args) {
     int n=5;
     int result=calculterFactorial(n);
        System.out.println(result);
    }
}
