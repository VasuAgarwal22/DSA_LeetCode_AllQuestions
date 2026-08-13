class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double average = Integer.MAX_VALUE;
        for(int i = 0;i<n/2;i++){
            double av = ((nums[i]+nums[n-1-i])/2.0);
            average = Math.min(av,average);
        }
        return average;
    }
}