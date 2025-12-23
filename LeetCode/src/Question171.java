public class Question171 {
    public static int  titleToNumber(String str){
        int result=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            result=result*26+(ch-'A'+1);
        }
        return result;
    }
    public static void main(String[] args) {
        String str="AB";
        System.out.println(titleToNumber(str));
    }
}
