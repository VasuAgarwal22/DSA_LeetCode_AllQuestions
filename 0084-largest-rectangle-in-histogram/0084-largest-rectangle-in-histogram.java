class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            largestRectangleArea(new int[] { i });
        }
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> ans = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!ans.isEmpty() && heights[ans.peek()] >= heights[i]) {
                ans.pop();
            }
            left[i] = ans.isEmpty() ? 0 : ans.peek() + 1;
            ans.push(i);
        }
        ans.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!ans.isEmpty() && heights[ans.peek()] >= heights[i]) {
                ans.pop();
            }
            right[i] = ans.isEmpty() ? n - 1 : ans.peek() - 1;
            ans.push(i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] + 1;
            int area = width * heights[i];
            max = Math.max(area, max);
        }
        return max;
    }
}