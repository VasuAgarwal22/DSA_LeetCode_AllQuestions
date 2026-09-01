class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x == reverse(x);
    }
    private int reverse(int x){
        int ans = 0;
        while(x!=0){
            int temp = x%10;
            ans = ans*10 + temp;
            x/=10;
        }
        return ans;
    }
}