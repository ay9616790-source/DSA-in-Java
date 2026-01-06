public class ClearLastIbits {
    public static int clearLastIbits(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIbits(15,2));
    }
}
