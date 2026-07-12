class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sort = arr.clone();
        Arrays.sort(sort);
        Map<Integer, Integer> ans = new HashMap<>();
        int r = 1;
        for(int num : sort){
            if(!ans.containsKey(num)){
                ans.put(num,r++);
            }
        }
        for(int i= 0;i<arr.length;i++) arr[i] = ans.get(arr[i]);
        return arr;
    }
}