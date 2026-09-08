class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int ans = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int next = num + 1;
                while(set.contains(next)){
                    count++;
                    next++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}