public class Question1404 {
    public static int numSteps(String s){
        long number = Long.parseLong(s, 2);
        int count=0;
        while(number!=1){
            if(number%2==0){
                number=number/2;
            }else{
               number= number+1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s= "1111011110000011100000110001011011110010111001010111110001";
        System.out.println(numSteps(s));

    }
}
