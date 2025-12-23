public class GetIiThBit {
    public static void CheckithBit(int n,int i){
        int bitmask=1<<i;
        if((n& bitmask)==0){
            System.out.println("0");
        }else{
            System.out.println(" i th bits is =1");
        }
    }
    public static void main(String[] args) {
        CheckithBit(10,2);
    }
}
