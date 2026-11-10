class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();
        for (int num : nums1) {
            ans1.add(num);
        }
        for (int num : nums2) {
            if (ans1.contains(num)) {
                ans2.add(num);
            }
        }
        int result[] = new int[ans2.size()];
        int i = 0;
        for (int num : ans2) {
            result[i++] = num;
        }
        return result;
    }
}