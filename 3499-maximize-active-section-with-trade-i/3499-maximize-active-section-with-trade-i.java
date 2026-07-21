class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int total = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1') total++;
        }
        s = "1" + s + "1";
        int i = 0;
        List<String> ans = new ArrayList<>();
        while(i<s.length()){
            StringBuilder sb = new StringBuilder();
            char ch = s.charAt(i);
            while(i<s.length() && ch == s.charAt(i)){
                sb.append(s.charAt(i));
                i++;
            }
            ans.add(sb.toString());
        }
        int max = 0;
        for(int j = 1;j<ans.size()-1;j++){
            if(ans.get(j).charAt(0) == '1' && ans.get(j+1).charAt(0) == '0' && ans.get(j-1).charAt(0) == '0'){
                int max1 = ans.get(j+1).length() + ans.get(j-1).length();
                max = Math.max(max1,max);
            }
        }
        return total + max;
    }
}