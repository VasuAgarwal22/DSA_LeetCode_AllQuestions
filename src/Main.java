import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5,6,7,8};
        int [] nums2 = {1,2,3,4,5,8,9,6,4,1};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int [] nums1, int [] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        set1.retainAll(set2);
        int [] result = new int[set1.size()];
        int index = 0;
        for(int num : set1) result[index++] = num;
        return result;
    }
}