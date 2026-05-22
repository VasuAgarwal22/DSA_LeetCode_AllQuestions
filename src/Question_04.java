public class Question_04 {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0,j=0,k = 0;
        int n = nums1.length;
        int m = nums2.length;
        int [] merged = new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }
        while(i<n){
            merged[k++]=nums1[i++];
        }
        while(j<m){
            merged[k++]=nums2[j++];
        }
        if((n+m)%2==0){
            return (merged[(n+m)/2] + merged[(n+m)/2 - 1]) / 2.0;
        }else{
            return merged[(n+m)/2];
        }
    }
}
