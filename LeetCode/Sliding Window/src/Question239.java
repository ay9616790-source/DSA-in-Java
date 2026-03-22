import java.util.Deque;
import java.util.LinkedList;

public class Question239 {

    public static int[] maxSlidingWindow(int[] nums, int k){

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < nums.length; i++){

            // Remove elements outside window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            // Remove smaller elements
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store result
            if(i >= k-1){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args){

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] res = maxSlidingWindow(nums,k);

        for(int x : res)
            System.out.print(x + " ");
    }
}