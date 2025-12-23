public class Array5 {
    public static void main(String[] args) {
        int [] num={ 1 ,2,3,4, 6 };
        int value=num[0];
        boolean isStorated=true;
        for(int i=0;i<num.length-1;i++){
            if(num[i]> num[i+1]){
                isStorated=false;
                break;
            }
        }
        if(isStorated){
            System.out.println("This arry is acc. order");
        }else{
            System.out.println(" This is not in acc. order");
        }

    }
}
