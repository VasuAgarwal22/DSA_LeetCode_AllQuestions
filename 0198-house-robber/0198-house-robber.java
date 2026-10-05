class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }
    private int loot(int index, int [] nums ){
        if(index>=nums.length) return 0;
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick = nums[index] + loot(index+2,nums);
        int skip = loot(index+1,nums);
        return dp[index] = Math.max(pick,skip);
    }
}