import java.util.Scanner;


public class CountLowerCaseVowels {
    public static int CountVowels(String  sb){
        int count=0;

        for(int i=0;i<sb.length();i++){
           char ch=sb.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sb=sc.nextLine();
        System.out.println(CountVowels(sb));
    }
}
