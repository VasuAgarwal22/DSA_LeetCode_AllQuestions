class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int num : nums) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }
        if (k == 1) {
            int max = -1;
            for (int num : nums) {
                if (ans.get(num) == 1) {
                    max = Math.max(max,num);
                }
            }
            return max;
        } else if (k == nums.length) {
            return large(nums);
        } else {
            int first = nums[0];
            int second = nums[nums.length - 1];
             int firstValue = ans.get(first) == 1 ? first : -1;
             int lastValue = ans.get(second) == 1 ? second : -1;
             return Math.max(firstValue,lastValue);
        }
    }

    private int large(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }
}