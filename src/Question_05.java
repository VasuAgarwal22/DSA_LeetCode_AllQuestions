public class Question_05 {
    public static void main(String[] args) {
        int ans = reverse(123);
        System.out.println("Reverse of a number is : " + ans );
    }
    public static int reverse(int n){
        int ans = 0;
        while(n>0){
            int temp = n%10;
            if(ans>Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10) return 0;
            ans = ans*10 + temp;
            n/=10;

        }
        return ans;
    }
}
