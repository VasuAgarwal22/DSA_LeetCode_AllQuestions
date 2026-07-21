class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> ans1 = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                ans1.add(nCr(i-1,j-1));
            }
            ans.add(ans1);
        }
        return ans;
    }
    private int nCr(int row, int col){
        long res = 1;
        for(int i = 0;i<col;i++){
            res= (res* (row-i))/(i+1);
           
        }
        return (int)res;
    }
}