class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == ')') count--;
            if(count!=0) sb.append(ch);
            if(ch == '(') count++;
        }
        return sb.toString();
    }
}