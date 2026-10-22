class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m)
            return false;
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ch1[s1.charAt(i) - 'a']++;
            ch2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(ch1, ch2)) {
            return true;
        }
        for (int right = n; right < m; right++) {
            ch2[s2.charAt(right) - 'a']++;
            ch2[s2.charAt(right - n) - 'a']--;
            if (Arrays.equals(ch1, ch2))
                return true;
        }
        return false;
    }
}