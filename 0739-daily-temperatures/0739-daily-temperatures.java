class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int index = st.pop();
                ans[index] = i-index;
            }
            st.push(i);
        }
        return ans;
    }
}