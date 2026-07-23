class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans = 0;
        for(int num : piles){
            if(num>end) end = num;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            long totalHrs = func(piles,mid);
            if(totalHrs<=h){
                ans = mid;
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    private long func(int [] piles, int mid){
        long total = 0;
        for(int i = 0;i<piles.length;i++){
            total += (int) Math.ceil((double) piles[i]/mid);
        }
        return total;
    }
}