class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        int num = 1;
        if(n<8) return n;
        while(n>0){
            ans += num*Math.min(8,n);
            n-=8;
            num++;
        }
        return ans;
    }
}