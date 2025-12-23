public class TWoNumOFArrayElementIsEqualX {
    public static void findSum( int [] arr,int target){
        boolean found=false;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indx"+i+"+"+j+"="+target);
                    found =true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No pair found with sum = " + target);
        }
    }

    public static void main(String[] args) {
        int [] num={ 25,63,69,2,3};
        int x=20;
        findSum(num,x);
    }
}
