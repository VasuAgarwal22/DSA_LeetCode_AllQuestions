class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int num : nums){
            int count = map.getOrDefault(num,0);
            if(count<2){
                nums[index++]=num;
                map.put(num,count+1);
            }
        }
        return index;
    }
}