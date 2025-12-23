public class PairOFArrayElement {
    public static void Pair(int [] nums){
        int n= nums.length;
        int total=0;
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            int Curr=nums[i];
            for(int j=i+1;j<n;j++){
                System.out.print( "("+Curr+","+nums[j]+")" );
                total++;
                }
            System.out.println();
            }
        System.out.println("Total Pairs ="+total);

    }

    public static void main(String[] args) {
        int [] nums={2,4,8,9,10,11,12};
        Pair(nums);
    }
}
