public class GitBit {
    public static void main(String[] args) {
        int num=5;
        int pos=2;
        int bitmarks=1<<pos;
        if((bitmarks & num) == 0){
            System.out.println("You position value is 0");
        }else{
            System.out.println("Your postion value is 1");
        }
    }
}
