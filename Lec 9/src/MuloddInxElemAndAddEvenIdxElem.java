public class MuloddInxElemAndAddEvenIdxElem {
    public static void calc(int [] arr,int n,int m){
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+m;

            }else{
                arr[i]=arr[i]*n;

            }
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int [] nums={10,20,30,40,50,60};
        int Mul=2;
        int add=10;
        calc(nums,Mul,add);
    }
}
