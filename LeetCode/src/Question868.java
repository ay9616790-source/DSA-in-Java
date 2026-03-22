public class Question868 {
    public static int binaryGap(int n){
        String str=Integer.toBinaryString(n);
        int max=0;
//        int i=0;
//        int j=i+1;
//        int curr=0;
//        while(i<str.length() && j<str.length()){
//            if(str.charAt(i)==str.charAt(j)){
//                curr=j-i;
//                max=Math.max(max,curr);
//                i=j;
//            }else{
//                j++;
//                i++;
//            }
//        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                int curr=0;
                if(str.charAt(i)==str.charAt(j) &&str.charAt(i)=='1'){
                    curr=j-i;
                    i=j;
                    max=Math.max(curr,max);
                }

            }
        }

            return max;


    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(binaryGap(n));

    }
}
