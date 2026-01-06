public class SelectionSortByGFG {
    public static int [] accToAccOrder(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] n={5,-2,6,7,2,0,7,2};
        int []result=accToAccOrder(n);
        for(int val : result){
            System.out.print(val);
        }

    }
}
