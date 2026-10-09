class Solution {
    public int minInsertions(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int open = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                  open++;
            }else{
                if( i+1 < s.length() && s.charAt(i+1) == ')'){
                    if(open>0){
                        open--;
                    }else{
                        res++;
                    }
                    i++;
                }else{
                    if(open>0){
                        open--;
                        res++;
                    }else{
                        res = res+2;
                    }
                }
            }
        }
        res += open*2;
        return res;
    }
}