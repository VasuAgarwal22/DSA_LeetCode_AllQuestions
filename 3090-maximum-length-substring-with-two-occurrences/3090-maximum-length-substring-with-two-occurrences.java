class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int max = 0;
        int n = s.length();
        int [] count = new int[26];
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            count[ch-'a']++;
            while (count[ch-'a'] > 2) {
                char leftChar = s.charAt(left);
                count[leftChar-'a']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}