class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(sum > 9*num) return "";
        while(num>0){
            int val = Math.min(9,sum);
            sum-=val;
            sb.append(val);
            num--;
        }
        return sb.toString();
    }
}