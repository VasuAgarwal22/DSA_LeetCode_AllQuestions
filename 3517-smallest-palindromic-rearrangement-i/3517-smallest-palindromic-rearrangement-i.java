class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i = 0;i<freq.length;i++){
            int times = freq[i]/2;
            while(times-->0){
                sb.append((char) (i+'a'));
            }
        }
        String first = sb.toString();
        String second = new StringBuilder(first).reverse().toString();
        char mid = 0;
        for(int i = 0;i<26;i++){
            if(freq[i]%2 == 1){
                mid = (char)(i+'a');
                break;
            }
        }
        if(s.length() % 2 == 0) return first + second;
        else return first + mid + second;
    }
}