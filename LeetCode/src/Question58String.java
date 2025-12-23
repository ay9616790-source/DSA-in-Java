public class Question58String {
    public static int lastStringLength(String s){
      s=  s.trim();
        char ch[]=s.toCharArray();
        int idx=0;
//        for(int i=ch.length-1;i>=0;i--){
//            for(int j=0;j<ch.length;j++){
//                if(ch[j]==' '){
//
//                   idx=j-i;
//                }
//            }
//
//        }
        int i=ch.length-1;int j=ch.length-1;
        while(i>=0 &&j>=0){
            if(ch[j]==' '){


                idx=j-i;
                break;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lastStringLength(s));
    }
}
