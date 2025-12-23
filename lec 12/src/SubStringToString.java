public class SubStringToString {
    public static void PrintSunString(String ch){
        for(int i=0;i<ch.length();i++){
            for(int j=i;j<ch.length();j++){
                System.out.print(ch.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String s="gopi";
        PrintSunString(s);

    }
}
