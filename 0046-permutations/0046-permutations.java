class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] use = new boolean[nums.length];

        backtrack(nums,ans,current,use);
        return ans;
    }
    private void backtrack(int[] nums , List<List<Integer>> ans,List<Integer> current,boolean[] use){
        if(current.size() == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
       
        for(int i = 0;i<nums.length;i++){
             if(use[i]){
            continue;
            }
            current.add(nums[i]);
            use[i] = true;

             backtrack(nums,ans,current,use);
             current.remove(current.size()-1);
             use[i] = false;
        }
       
    }
}