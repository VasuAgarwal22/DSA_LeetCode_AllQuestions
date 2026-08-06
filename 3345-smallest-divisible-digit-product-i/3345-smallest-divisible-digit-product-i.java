class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=100;i++){
            int prod = product(i);
            if(prod % t == 0) return i;
        }
        return -1;
    }
    private int product(int n){
        int ans = 1;
        while(n>0){
            int temp = n%10;
            ans = ans*temp;
            n/=10;
        }
        return ans;
    }
}