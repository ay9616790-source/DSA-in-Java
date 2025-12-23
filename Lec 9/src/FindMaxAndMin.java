public class FindMaxAndMin {
    public static void main(String[] args) {
        int [] num={5,8,9,13,500,-1};
        int max=num[0];
        int min=num[0];
        for(int i=0;i< num.length;i++){
            if(num[i]>max){
                max=num[i];

            }
            if(num[i]<min){
                min=num[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
