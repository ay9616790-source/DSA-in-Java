public class GetMaxOccurChar {
    public static char printMaxOccurch(String sb){
        int freq[]=new int[26];
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        int maxFreq=0;
        char ans= sb.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String sb="abcdsaaghidddd";

        System.out.println(printMaxOccurch(sb));
    }
}
