class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> arr = new ArrayList<>(map.keySet());
        arr.sort((a,b)-> map.get(b)-map.get(a));
        int [] a = new int[k];
        for(int i = 0;i<a.length;i++) a[i] = arr.get(i);
        return a;
    }
}