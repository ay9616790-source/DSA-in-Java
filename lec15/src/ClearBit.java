public class ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int orOperater=~(bitmask);
         int newNumber=orOperater & n;
        System.out.println(newNumber);
    }
}
