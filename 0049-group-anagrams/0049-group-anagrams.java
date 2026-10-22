class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String s1 : strs){
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            ans.putIfAbsent(key,new ArrayList<>());
            ans.get(key).add(s1);
        }
        return new ArrayList<>(ans.values());
    }
}