import java.util.Scanner;

//Print out the sum of the numbers in the second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
public class Question2 {
    public static int sumOfUserInputrow(int[][] matrix,int num ){
        int m=matrix[0].length;
        int sum=0;
        for(int j=0;j<m;j++){
                sum +=matrix[num][j];
            }

        return sum;
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},
                        {11,4,3},
                        {2,2,3} };
        Scanner sc=new Scanner(System.in);
        System.out.println("Input row no. iska sum chiya:");
        int n=sc.nextInt();
        if(n>=0 && n< nums.length){
            System.out.println("Enter your "+n+"="+sumOfUserInputrow(nums,n));
        }else{
            System.out.println("Invalid indx");
        }


    }
}
