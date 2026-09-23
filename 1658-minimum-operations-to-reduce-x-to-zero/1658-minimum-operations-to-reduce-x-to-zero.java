class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums) totalSum+=num;
        int total = totalSum-x;
        if(total<0) return -1;
        if(total == 0) return nums.length;
        int left = 0;
        int maxLen = -1;
        int sum = 0;
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>total && left<=right){
                sum-=nums[left++];
            }
            if(sum == total){
                maxLen = Math.max(maxLen,right-left+1);
            }
        }
        return maxLen == -1 ? -1 : nums.length-maxLen;
    }
}