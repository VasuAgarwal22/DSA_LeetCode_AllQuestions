class Solution {
    public int countCommas(int n) {
        if(n<=999) return 0;
        int val = 1000;
        int ans = n - val + 1;
        return ans;
    }
}