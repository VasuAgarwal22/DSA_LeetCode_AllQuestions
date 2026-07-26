class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            ans.put(rem,ans.getOrDefault(rem,0)+1);
            temp/=10;
        }
        int ans1 = 0;
        for(Map.Entry<Integer, Integer> entry : ans.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            ans1 = ans1 + (key*value);
        }
        return ans1;
    }
}