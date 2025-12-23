public class CheckEvenOdd {
    public static void CheckEvenOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        CheckEvenOdd(11);
        CheckEvenOdd(12);
        CheckEvenOdd(2);

    }
}
