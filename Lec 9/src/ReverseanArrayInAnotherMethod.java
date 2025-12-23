public class ReverseanArrayInAnotherMethod {
    public static void main(String[] args) {
        int[] arr = {45, 26, 59, 82, 56, 23, 23,56};
        //Original array
        for(int element:arr){
            System.out.print(element+" ");
        }

        int n = arr.length;
        //logic to reverse array
        for (int i = 0; i < n/2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
        System.out.println();
        //Reverse array

        for(int element:arr) System.out.print(element+" ");
    }

}
