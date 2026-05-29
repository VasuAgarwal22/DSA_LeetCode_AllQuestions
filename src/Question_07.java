public class Question_07 {
    public static void main(String[] args) {
        int [] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int [] height){
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right){
            int curr = Math.min(height[left],height[right])*(right-left);
            max = Math.max(curr,max);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
