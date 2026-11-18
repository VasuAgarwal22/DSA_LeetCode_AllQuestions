class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int zeros = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]==0) zeros++;
            if(map.containsKey(sum-zeros)){
                max = Math.max(max,i-map.get(sum-zeros));
            }else{
                map.put(sum-zeros,i);
            }
        }
        return max;
    }
}