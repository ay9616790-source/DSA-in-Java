public class Question8 {
    public static int myAtoi(String s){

        int  sign=1;
        int val=0;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 🚨 Overflow check
            if (val > Integer.MAX_VALUE / 10 ||
                    (val == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            val = val * 10 + digit;
            i++;
        }
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(Character.isDigit(ch)){
//
//                val=val*10+(ch-'0');
//            }
//        }
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)=='-'){
//                sign=-1;
//            }
//        }


        return val*sign;

    }
    public static void main(String[] args) {
        String s="0-1";
        System.out.println(myAtoi(s));
    }
}
