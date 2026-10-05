class Solution {
    static int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        return helper(0,0,grid.length,grid[0].length,grid);
    }
    private int helper(int r, int c, int m , int n , int [][] grid){
        if(r == m-1 && c == n-1) return grid[r][c];
        if(dp[r][c]!=0) return dp[r][c];
        int left =Integer.MAX_VALUE ;
        int  right = Integer.MAX_VALUE;
        if(r<m-1)left = grid[r][c] + helper(r+1,c,m,n,grid);
        if(c<n-1) right = grid[r][c] + helper(r,c+1,m,n,grid);
        return dp[r][c] = Math.min(left,right);
    }
}