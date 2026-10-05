class Solution {
    static int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int choice1 = cost(0, cost);
        int choice2 = cost(1, cost);
        return Math.min(choice1, choice2);
    }

    private int cost(int index, int[] nums) {
        if (index >= nums.length)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int pick = nums[index] + cost(index + 1, nums);
        int skip = nums[index] + cost(index + 2, nums);
        return dp[index] = Math.min(pick, skip);
    }
}