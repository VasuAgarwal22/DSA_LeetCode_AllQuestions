class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = n*n+n;
        return gcd(odd,even);
    }
    private int gcd(int a, int b){
        return b == 0? a:gcd(b,a%b);
    }
}