class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }
        boolean [] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        visited[k] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int next : graph.get(node)){
                if(!visited[next]){
                    visited[next]  =true;
                    queue.offer(next);
                }
            }
        }
        for(int [] edge: invocations){
            int u = edge[0];
            int v = edge[1];
            if(!visited[u] && visited[v]){
                List<Integer> ans = new ArrayList<>();
                for(int i = 0;i<n;i++) ans.add(i);
                return ans;
            }    
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(!visited[i]) ans.add(i);
        }
        return ans;
    }
}