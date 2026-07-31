class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int count = 0;
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        for (int i = 25; i >= 0; i--) {
            ans += freq[i] * (count / 8 + 1);
            count++;
        }
        return ans;
    }
}