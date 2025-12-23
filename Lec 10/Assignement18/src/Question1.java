//Print the number of 7’s that are in the 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

public class Question1 {
    public static int SerachNumber(int [][]matrix,int num){
        int n= matrix.length;;
        int m=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==num){
                    count++;
                }
            }
        }
        return count;
    }
public static void main(String[]args){
    int [][]arr={{4,7,8},
            {8,8,7}};
    System.out.println(SerachNumber(arr,7));
}
}
