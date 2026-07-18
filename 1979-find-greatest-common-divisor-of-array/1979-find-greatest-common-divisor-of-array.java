class Solution {
    public int findGCD(int[] nums) {
        int max  = nums[0];
        int min = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        return gcd(max,min);
    }
    private int gcd(int max, int min){
       if(min==0){
           return max;
       }else{
         return gcd(min,max%min);
       }
    }
    
}