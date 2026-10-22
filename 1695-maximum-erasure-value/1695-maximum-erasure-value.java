class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            max = Math.max(max, sum);
        }
        return max;
    }
}