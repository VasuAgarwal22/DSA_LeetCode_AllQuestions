class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    private void bfs(int i, int[][] arr, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;
        while (!queue.isEmpty()) {
            int val = queue.poll();
            for (int j = 0; j < arr.length; j++) {
                if (arr[val][j] == 1 && !visited[j]) {
                    queue.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}