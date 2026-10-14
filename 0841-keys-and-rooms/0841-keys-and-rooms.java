class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean [] visited = new boolean[n];
        bfs(rooms,visited);
        for(int i = 0;i<n;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    private void bfs(List<List<Integer>> rooms,boolean [] visited){
        Queue<Integer> ans = new LinkedList<>();
        ans.add(0);
        visited[0] = true;
        while(!ans.isEmpty()){
            int val = ans.poll();
            for(int key : rooms.get(val)){
                if(!visited[key]){
                    visited[key] = true;
                    ans.add(key);
                }
            }
        }
    }
}