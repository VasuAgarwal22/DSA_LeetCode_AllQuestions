class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean [] visited = new boolean[n];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++) ans.add(new ArrayList<>());
        for(int [] edge : edges){
            ans.get(edge[0]).add(edge[1]);
            ans.get(edge[1]).add(edge[0]);
        }
        return bfs(source,destination,ans,visited);
    }
    private boolean bfs(int start, int end , List<List<Integer>> graph,boolean [] visited){
        Queue<Integer> ans = new LinkedList<>();
        visited[start] = true;
        ans.add(start);
        while(!ans.isEmpty()){
            int node = ans.poll();
            if(node == end) return true;
            for(int val : graph.get(node)){
                if(!visited[val]){
                    visited[val] = true;
                    ans.add(val);
                }
            }
        }
        return false;
    }
}