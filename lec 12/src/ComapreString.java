public class ComapreString {
    public static int comapareTo(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int min=Math.min(n1,n2);
        for(int i=0;i<min;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return n2-n1;
    }
    public static void main(String[] args) {
        String s1 = "gitanjali";
        String s2 = "alok";
        System.out.println(comapareTo(s1,s2));
    }
}
