public class SubString {
    public static String name(String sec,int str,int end) {
        String Subchar="";
        for(int i=str;i<end;i++){
           Subchar += sec.charAt(i);
        }
        return Subchar;
    }
    public static void main(String[] args) {
        String sec="HelloWorld";
        System.out.println(name(sec,0,5));
    }
}
