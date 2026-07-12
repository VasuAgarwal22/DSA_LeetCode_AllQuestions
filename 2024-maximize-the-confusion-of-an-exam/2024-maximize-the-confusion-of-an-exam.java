class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        // T T F F
        int left = 0;
        int ans = 0;
        int co1 = 0;  // 2
        int co2 = 0;  // 2
        for(int right = 0;right<s.length();right++){
            if(s.charAt(right)=='T') co1++;
            else co2++;

//  isme iske andar nhi jayega
// T F F T
//        |   |   
//  T T F T T F T T 
            while(Math.min(co1,co2)>k){
                if(s.charAt(left) == 'T') co1--;
                else co2--;
                left++;

            }

            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}