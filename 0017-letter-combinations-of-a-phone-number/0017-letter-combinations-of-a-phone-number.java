class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();
        if (digits.isEmpty())
            return new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        pad("", digits, ans, map);
        return ans;
    }

    private void pad(String p, String up, List<String> ans, HashMap<Integer, String> map) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        String letters = map.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            pad(p + ch, up.substring(1), ans, map);
        }
    }
}