class MyHashMap {
    ArrayList<int[]> ans;

    public MyHashMap() {
        ans = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i)[0] == key) {
                ans.get(i)[1] = value;
                return;
            }
        }
        ans.add(new int[] { key, value });
    }

    public int get(int key) {
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i)[0] == key) {
                return ans.get(i)[1];
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i)[0] == key) {
                ans.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */