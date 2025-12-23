public class DecimalToBinary {
    public static void decTobin(int n){
        int pow =0;
        int bin=0;
        int myNum=n;
        while(n>0){
            int  rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        decTobin(7);
    }
}
