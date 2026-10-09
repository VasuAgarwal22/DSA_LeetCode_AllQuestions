class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                st.push(token);
            } else {
                int val1 = Integer.parseInt(st.pop());
                int val2 = Integer.parseInt(st.pop());
                int ans = calc(token, val2, val1);
                st.push(Integer.toString(ans));
            }
        }
        return Integer.parseInt(st.peek());
    }

    private int calc(String s, int val1, int val2) {
        int ans = 0;
        if (s.equals("+"))
            ans = val1 + val2;
        if (s.equals("*"))
            ans = val1 * val2;
        if (s.equals("/"))
            ans = val1 / val2;
        if (s.equals("-"))
            ans = val1 - val2;
        return ans;
    }
}