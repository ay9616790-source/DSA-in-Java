public class Array4 {
    public static void main(String[] args) {
        int[] num= {4,5,62,30,12,0};
        int max=Integer.MIN_VALUE;
        System.out.println(max);
        int min=Integer.MAX_VALUE;
        System.out.println(min);
        for(int i=0;i< num.length;i++){
            if(num[i]<min){
                min=num[i];
            }if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
