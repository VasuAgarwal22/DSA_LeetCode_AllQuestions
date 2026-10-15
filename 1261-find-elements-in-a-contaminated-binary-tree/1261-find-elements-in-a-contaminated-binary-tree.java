/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    HashSet<Integer> ans;
    public FindElements(TreeNode root) {
        ans = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.offer(root);
        ans.add(0);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int val = curr.val;
            if(curr.left!=null){
                curr.left.val = 2*val+1;
                ans.add(curr.left.val);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                curr.right.val = 2*val+2;
                ans.add(curr.right.val);
                q.offer(curr.right);
            }
        }
    }
    
    public boolean find(int target) {
        return ans.contains(target)?true : false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */