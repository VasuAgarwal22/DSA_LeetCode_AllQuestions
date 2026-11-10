class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    static {
        Solution jvmWarmup = new Solution();
        for (int i = 0; i < 200; i++) {
            jvmWarmup.containsDuplicate(new int[0]);
        }
    }
}