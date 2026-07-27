class Solution {
    Integer dp[][];
    public int uniquePathsWithObstacles(int[][] arr) {
        dp = new Integer[arr.length][arr[0].length]; 
        return helper(arr,0,0);
    }
    private int helper(int [][] arr, int r, int c){
           if(arr[r][c] == 1){
            return 0;
        }

        if(r == arr.length-1 && c== arr[0].length-1){
            return 1;
        }
        if(dp[r][c]!= null){
            return dp[r][c];
        }
        int left= 0;
        int right = 0;
     
        if(r<arr.length-1){
             left = helper(arr,r+1,c);
        } 
        if(c<arr[0].length-1){
             right = helper(arr,r,c+1);
        }
        return dp[r][c] = left+right;
    } 
  }