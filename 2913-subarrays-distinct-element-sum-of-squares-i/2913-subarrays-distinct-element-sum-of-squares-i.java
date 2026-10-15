class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
              HashSet<Integer> ans = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                ans.add(nums.get(j));
                sum += (ans.size() * ans.size());
            }
        }
        return sum;
    }
}