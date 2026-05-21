import java.util.Arrays;
import java.util.HashMap;

//  1. Two Sum
public class Question_01 {
    public static void main(String[] args) {
        int [] nums = {22,7,2,15};
        int target = 9;
        int [] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    }

