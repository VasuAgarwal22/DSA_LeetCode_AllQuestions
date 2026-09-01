class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x!=0){
            int temp = x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10) return 0;
            reverse = reverse*10 + temp;
            x/=10;
        }
        return reverse;
    }
}