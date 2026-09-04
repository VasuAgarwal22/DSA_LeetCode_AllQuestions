class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int find = findMax(nums,0,i)-findMin(nums,i,n-1);
            if(find<=k){
               return i;
            }
        }
        return -1;
    }
    private int findMax(int []nums, int i, int j ){
        int max = Integer.MIN_VALUE;
        for(int l = i;l<=j;l++){
            max = Math.max(max,nums[l]);
        }
        return max;
    }
    private int findMin(int [] nums, int i, int j  ){
          int min = Integer.MAX_VALUE;
        for(int l = i;l<=j;l++){
            min = Math.min(min,nums[l]);
        }
        return min;
    }
}