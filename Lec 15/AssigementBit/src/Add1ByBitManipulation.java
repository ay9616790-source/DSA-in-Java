public class Add1ByBitManipulation {
    public static int Add1InInteger(int n){
        String binary = Integer.toBinaryString(n);
        int bitmask=1;
        int result=n+1;
        return result;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Add1InInteger(n));

    }
}
