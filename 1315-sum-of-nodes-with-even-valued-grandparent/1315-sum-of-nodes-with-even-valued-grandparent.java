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
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        // 6 7 8 2 7 1 3 9 1 4 5 
        Queue<TreeNode[]> q = new LinkedList<>();
        int sum = 0;
        q.offer(new TreeNode[]{root,null,null});
        while(!q.isEmpty()){
            TreeNode[] curr = q.poll();
            TreeNode node = curr[0];
            TreeNode parent = curr[1];
            TreeNode grand = curr[2];
            if(grand !=null && grand.val%2==0){
                sum+=node.val;
            }
            if(node.left!=null) q.offer(new TreeNode[]{node.left,node,parent});
            if(node.right != null) q.offer(new TreeNode[]{node.right,node,parent});
        }
        return sum;
    }
}