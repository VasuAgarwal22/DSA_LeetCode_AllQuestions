class Solution {
    public int countServers(int[][] grid) {
        int[] one = new int[grid.length];
        int[] two = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    one[i]++;
                    two[j]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && (one[i] > 1 || two[j] > 1)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}