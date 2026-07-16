class Solution {
    public long gcdSum(int[] nums) {
        long ans = 0;
        int max = nums[0];
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            temp[i] = gcd(nums[i], max);
        }
        Arrays.sort(temp);
        // 2 2 6 8
        int i = 0;
        int j = temp.length - 1;
        while (i < j) {
            ans += gcd(temp[i], temp[j]);
            i++;
            j--;
        }
        return ans;
    }

    private int gcd(int a , int b ){
        return (b==0)?a:gcd(b,a%b);
    }
}
