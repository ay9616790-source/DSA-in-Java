public class Question4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

//        int n1 = nums1.length;
//        int n2 = nums2.length;

        int[] newArr = new int[ nums1.length+ nums2.length];

        int i = 0, j = 0, k = 0;

        // merge sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            newArr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            newArr[k++] = nums2[j++];
        }

        int n = newArr.length;
        double median;

        // find median
        if (newArr.length % 2 == 0) {
//            int mid = newArr.length / 2;
            median = (newArr[(newArr.length / 2)-1] + newArr[newArr.length / 2]) / 2.0;
        } else {
            median = newArr[newArr.length / 2 ];
        }

        return median;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        System.out.println(findMedianSortedArrays(arr1, arr2)); // Output: 2.0
    }
}
