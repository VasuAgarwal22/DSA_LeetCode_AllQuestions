class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        while(n>0){
            int r = n%10;
            ans+=r;
            n/=10;
        }
        return ans;
    }
}