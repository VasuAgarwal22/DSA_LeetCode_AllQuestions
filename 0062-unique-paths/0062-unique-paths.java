class Solution {
    Integer dp[][];
    public int uniquePaths(int m, int n) {
        dp = new Integer[m][n];
        return helper(0,0,m,n);
    }
    private int helper(int r, int c, int m , int n){
        if(r == m-1 && c == n-1){
            return 1;
        }
        if(dp[r][c] != null){
            return dp[r][c];
        }
        int left =0 ;
        int right = 0;
        if(r<m-1){
            left = helper(r+1,c,m,n);
        }
        if(c<n-1){
            right = helper(r,c+1,m,n);
        }
        return dp[r][c] = left + right;
    }
}
