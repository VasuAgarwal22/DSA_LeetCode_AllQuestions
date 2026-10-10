class Solution {
    public boolean canAliceWin(int n) {
        int remain = 10;
        while(true){
            if(n<remain) return false;
            n-=remain;
            remain--;
            if(n<remain) return true;
            n-=remain;
            remain--;
        }
    }
}