public class CountVowel {
    public static void main(String[] args) {
        String ch=("ansxklseoiqyeoorpnncsaeiou");
        int count=0;
        for(int i=0;i<ch.length();i++){
            char s=ch.charAt(i);
            if(s =='a' || s=='e' || s=='i' || s=='o' ||s =='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
