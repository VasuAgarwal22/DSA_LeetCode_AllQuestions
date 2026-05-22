import java.util.HashSet;
// Longest substring without reeating characters.

public class Question_03 {

    public static void main(String[] args) {
      String s = "abcabcbb";
      int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s){
            int low = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int high = 0; high<s.length(); high++){
            while (set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            maxLen = Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}
