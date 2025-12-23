public class Question383 {
    public static boolean canConstruct(String s, String m){
        int []freq=new int [26];
        for(int i=0;i<m.length();i++){
            freq[m.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==0){
                return false;
            }
            freq[s.charAt(i)-'a']--;
        }

        return true;
    }
    public static void main( String[] args) {
        String s="aa";
        String m="ab";
        System.out.println(canConstruct(s,m));
    }
}
