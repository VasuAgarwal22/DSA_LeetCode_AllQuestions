class Solution {
    public int missingInteger(int[] nums) {
        int i = 0;
        int j = 1;
        int sum = nums[0];
        while(j<nums.length){
            if(nums[j] == nums[j-1] + 1){
                sum+=nums[j];
                j++;
            }else{
                break;
            }
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums) ans.add(num);
        while(ans.contains(sum)){
            sum++;
        }
        return sum;
    }
}