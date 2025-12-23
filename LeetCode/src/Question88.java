public class Question88 {
    public static int [] merge(int [] nums1,int []nums2,int n,int m){
        int i=m-1,j=n-1 ,k= n+m-1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }


        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

return nums1;


    }
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;

        System.out.println(merge(nums1,nums2,m,n));
    }
}
