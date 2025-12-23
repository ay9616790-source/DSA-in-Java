public class Question168 {
    public static String charAt(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            n--;
            int remainder=n%26;
            char ch=(char)('A'+remainder);
            sb.append(ch);
            n /=26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println(charAt(n));
    }
}
