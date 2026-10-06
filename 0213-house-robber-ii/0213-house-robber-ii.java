class Solution {
    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int pick1 = loot(0, nums, n - 1);
        Arrays.fill(dp, -1);
        int pick2 = loot(1, nums, n);
        return Math.max(pick1, pick2);
    }

    private int loot(int index, int[] nums, int n) {
        if (index >= n)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int pick = nums[index] + loot(index + 2, nums, n);
        int skip = loot(index + 1, nums, n);
        return dp[index] = Math.max(pick, skip);
    }
}