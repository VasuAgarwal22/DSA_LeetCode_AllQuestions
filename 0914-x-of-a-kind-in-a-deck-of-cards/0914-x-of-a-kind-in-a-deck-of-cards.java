class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int num : deck){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        // 2 2 2 2
        int gcd = 0;
        for(int num : ans.values()){
                gcd = findGcd(gcd,num);
        }   
        return gcd>=2;
    }
    private int findGcd(int a , int b){
        return (b==0)?a:findGcd(b,a%b);
    }
}