class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 0) return 1;
        int count1 = 1;
        int count2 = 1;
        int ans = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count1++;
            }else{
                count1=1;
            }
            ans = Math.max(ans,count1);
        }

        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count2++;
            }else{
                count2=1;
            }
            ans = Math.max(ans,count2);
        }
        return ans;
    }
}