class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            sum += (1L * nums[j]*nums[j])-(1L * nums[i]*nums[i]);
            i++;
            j--;
        }
        if(nums.length%2 == 1){
            sum+=( 1L * nums[j]*nums[j]);
        }
        return sum;
    }
}
