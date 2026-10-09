class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s : emails){
            set.add(find(s));
        }
        return set.size();
    }
    private String find(String s){
        int val = 0;
        StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='@'){
            val = i;
            break;
        }
        }
        String local = s.substring(0,val);
        String domain = s.substring(val,s.length());
        for(int i = 0;i<local.length();i++){
            if(s.charAt(i)!='+' && s.charAt(i)!='.'){
                 sb1.append(s.charAt(i));
            }else if(s.charAt(i)=='+'){
                break;
            }
        }
        return sb1.toString()+domain;
    }
}