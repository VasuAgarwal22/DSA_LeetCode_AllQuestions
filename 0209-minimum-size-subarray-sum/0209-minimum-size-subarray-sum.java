class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int curr = 0;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr >= target) {
                curr -= nums[left];
                min = Math.min(min, right - left + 1);
                left++;
            }           
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}