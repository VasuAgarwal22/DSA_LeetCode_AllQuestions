class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int num : nums){
            if(num>=max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num>=max2){
                max3 = max2;
                max2 = num;
            }else if(num>max3){
                max3 = num;
            }
        }
        Arrays.sort(nums);
        return Math.max((max1*max2*max3),(nums[0]*nums[1]*max1));
    }
}