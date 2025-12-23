public class FindXvalue {
    public static void main(String[] args) {
         boolean found=false;

        int[] arr = {45, 6, 9, 1, 2, 32,};
        int x = 25;
        int count=0;
        for (int i = 0; i<arr.length;i++){
            if (x == arr[i]) {

               found=true;
               break;
            }
            if (arr[i] > x) {
                count++;
            }

        }
        System.out.println(found);
        System.out.println(count);


    }
}
