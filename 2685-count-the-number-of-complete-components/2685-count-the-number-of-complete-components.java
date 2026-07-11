class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                Queue<Integer> ans = new LinkedList<>();
                List<Integer> comp = new ArrayList<>();
                ans.offer(i);
                visited[i] = true;
                while (!ans.isEmpty()) {
                    int node = ans.poll();
                    comp.add(node);

                    for (int nei : adj.get(node)) {
                        if (!visited[nei]) {
                            visited[nei] = true;
                            ans.offer(nei);
                        }
                    }
                }
                int size = comp.size();
                boolean complete = true;

                for (int node : comp) {
                    if (adj.get(node).size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete)
                    count++;
            }
        }
        return count;
    }
}