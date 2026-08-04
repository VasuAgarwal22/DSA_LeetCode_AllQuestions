class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans =  new ArrayList<>();
        HashSet<Integer> ans1 = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            ans1.add(nums[i]);
            if(nums[i]<min) min = nums[i];
             if(nums[i]>max) max = nums[i];
        }
        // 1  5  
         for(int i = min;i<=max;i++){
             if(!ans1.contains(i)){
                 ans.add(i);
             }
         }
        return ans;
    }
}