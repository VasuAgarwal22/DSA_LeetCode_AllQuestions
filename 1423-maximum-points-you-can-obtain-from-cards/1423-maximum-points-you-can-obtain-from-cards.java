class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int n = cardPoints.length;
        for(int i = 0;i<k;i++){
            ans+=cardPoints[i];
        }
        int current = ans;
        for(int i=1;i<=k;i++){
            current-=cardPoints[k-i];
            current+=cardPoints[n-i];
            ans=Math.max(current,ans);
        }
        return ans;
    }
}