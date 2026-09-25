class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
        int m = needle.length();
        int i = 0;
        while(i<=n-m){
            if(haystack.startsWith(needle,i)){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
}