class Solution {
    public int maxProduct(int n) {
        List<Integer> ans = new ArrayList<>();
        while(n>0){
            int rem =n%10;
            ans.add(rem);
            n/=10;
        }
        Collections.sort(ans);
        return ans.get(ans.size()-1)*ans.get(ans.size()-2);
    }
}