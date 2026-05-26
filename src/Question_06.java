public class Question_06 {
    public static void main(String[] args) {
        boolean check = isPalindrome(131);
        System.out.println(check);
    }
    public static boolean isPalindrome(int x){
        if(x<0) return false;
        int ans = reverse(x);
        return ans == x;
    }
    private static int reverse(int n ){
        int rev = 0;
        while(n>0){
            int temp = n%10;
            rev = rev*10 + temp;
            n/=10;
        }
        return rev;
    }
}
