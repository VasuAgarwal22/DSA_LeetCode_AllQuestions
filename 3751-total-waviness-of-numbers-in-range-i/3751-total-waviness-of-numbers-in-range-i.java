class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            int total = check(i);
            ans += total;
        }
        return ans;
    }

    private int check(int num) {
        int ans = 0;
        if (num < 100)
            return 0;
        int len = 0;
        int temp = num;
        while (temp != 0) {
            len++;
            temp /= 10;
        }
        int[] arr = new int[len];
        int j = 0;
        while (num > 0) {
            int rem = num % 10;
            arr[j++] = rem;
            num /= 10;
        }
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int swap = arr[s];
            arr[s] = arr[e];
            arr[e] = swap;
            s++;
            e--;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                ans++;
            }
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                ans++;
            }
        }
        return ans;
    }
}