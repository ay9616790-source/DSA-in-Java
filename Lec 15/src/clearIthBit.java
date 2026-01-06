public class clearIthBit {
    public static int clearIthBits(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBits(int n,int i,int newBits){
        n=clearIthBits(n,i);
        int Bitmask=newBits<<i;
        return n|Bitmask;
    }
    public static void main(String[] args) {
        System.out.println( updateIthBits(2,2,1));

    }
}
