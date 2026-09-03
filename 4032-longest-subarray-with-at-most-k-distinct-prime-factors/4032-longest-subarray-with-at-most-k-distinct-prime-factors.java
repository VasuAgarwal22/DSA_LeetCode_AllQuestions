class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> ans = new HashMap<>();
        int dist = 0;
        int left = 0;
        int best = 0;
        for(int right = 0 ;right<n;right++){
            for(int p : getPrime(nums[right])){
                int c = ans.getOrDefault(p,0);
                if(c==0) dist++;
                ans.put(p,c+1);
            }
            while(dist>k){
                for(int p : getPrime(nums[left])){
                    int c = ans.get(p)-1;
                    ans.put(p,c);
                    if(c == 0) dist--;
                }
                left++;
            }
            best = Math.max(best,right-left+1);
        }
        return best;
    }
    private List<Integer> getPrime(int num){
        List<Integer> ans = new ArrayList<>();
        for(int i = 2;i*i<=num;i++){
            if(num%i == 0){
                ans.add(i);
                while(num%i == 0) num/=i;
            }
        }   
        if(num>1) ans.add(num);
        return ans;
    }
}