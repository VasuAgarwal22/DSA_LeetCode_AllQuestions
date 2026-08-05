class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0;i<words.length;i++){
            boolean check = true;
            for(int j = 0;j<words[i].length();j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    check = false;
                    break;
                }
            }
            if(check) count++;
        }
        return count;

    }
}
