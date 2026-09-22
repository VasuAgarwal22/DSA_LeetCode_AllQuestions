class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high = 0;
        int maxLength = 0;
        HashSet<Character> ans = new HashSet<>();
        for(high = 0; high < s.length();high++){
            while(ans.contains(s.charAt(high))){
                ans.remove(s.charAt(low));
                low++;
            }
            ans.add(s.charAt(high));
            maxLength = Math.max(maxLength,high-low+1);
        }
          return maxLength;
    }
}