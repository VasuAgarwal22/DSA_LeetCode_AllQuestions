class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                String prev = st.pop();
                sb.insert(0, prev);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}