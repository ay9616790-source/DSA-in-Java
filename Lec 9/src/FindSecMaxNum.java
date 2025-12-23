public class FindSecMaxNum {
    public static void main(String[] args) {
        int [] arr = {910 ,47, 65, 214, 929, 682, 595, 67};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                thirdmax = secMax;
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                thirdmax = secMax;
                secMax = arr[i];
            } else if (arr[i] > thirdmax && arr[i] < secMax) {
                thirdmax = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secMax);
        System.out.println("Third Max: " + thirdmax);
    }
}
