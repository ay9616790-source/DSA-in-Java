import java.util.Stack;

public class NextGreaterFind {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        Stack<Integer>s=new Stack<>();
        int []nxtGreater=new int[arr.length];
        int n= arr.length;
        for(int i=n-1;i>=0;i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                    s.pop();
            }
            if(s.isEmpty()){
               nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

    }
}
