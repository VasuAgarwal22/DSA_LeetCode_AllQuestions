class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long ans = 0;
        long start = 1000;
        int commas= 1 ;
        while(start<=n){
            long end = start* 1000-1;
            long count = Math.min(end,n)-start+1;
            ans+=count*commas;
            start*=1000;
            commas++;
        }
        return ans;
    }
}