class CustomStack {
    ArrayList<Integer> ans;
    int maxSize;
    public CustomStack(int maxSize) {
        ans = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(ans.size()>=maxSize){
            return;
        }
        ans.add(x);
    }
    
    public int pop() {
        if(ans.size()==0) return -1;
        return ans.remove(ans.size()-1);
    }
    
    public void increment(int k, int val) {
        for(int i = 0;i<Math.min(k,ans.size());i++){
            ans.set(i,ans.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */