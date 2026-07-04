class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> ans = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());
        for (int[] road : roads) {
            adj.get(road[0]).add(new int[] { road[1], road[2] });
            adj.get(road[1]).add(new int[] { road[0], road[2] });
        }
        ans.add(1);
        visited[1] = true;
        while (!ans.isEmpty()) {
            int curr = ans.poll();
            for (int[] edge : adj.get(curr)) {
                int neigh = edge[0];
                int weight = edge[1];
                min = Math.min(min, weight);
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    ans.offer(neigh);
                }
            }
        }
        return min;
    }
}