public class Question13 {
    public static int RomantoInteger(String str){
        int total=0;
        int preValue=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i);
            int value=0;

            if (ch == 'I') value = 1;
            else if (ch == 'V') value = 5;
            else if (ch == 'X') value = 10;
            else if (ch == 'L') value = 50;
            else if (ch == 'C') value = 100;
            else if (ch == 'D') value = 500;
            else if (ch == 'M') value = 1000;


            if(value<preValue){
                total -=value;
            }else{
                total +=value;
                preValue=value;
            }
        }
        return total;


    }
    public static void main(String[] args) {
        String str="III";
        System.out.println(RomantoInteger(str));
    }
}
