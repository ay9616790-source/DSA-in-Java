public class setIthBits {
    public static int setIthBits(int n,int i){
        int bitmask=1<<i;
        return n| bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBits(2,2));
    }
}
