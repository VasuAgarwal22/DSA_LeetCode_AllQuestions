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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root.val %2 ==0) return false;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = q.size();
            for(int i= 0;i<size;i++){
                TreeNode Node = q.poll();
                arr.add(Node.val);
                if(Node.left != null) q.offer(Node.left);
                if(Node.right!=null) q.offer(Node.right);
            }
            ans.add(arr);
        }
        for(int i = 0;i<ans.size();i++){
           List<Integer> curr = ans.get(i);
            for(int j = 0;j<curr.size();j++){
                int val =curr.get(j);
                if(i%2 ==0){
                    if(val%2 == 0) return false;
                    if(j>0 && curr.get(j-1)>=curr.get(j)) return false;
                }else{
                     if(val%2 == 1) return false;
                    if(j>0 && curr.get(j-1)<=curr.get(j)) return false;
                }
            }
        }
        return true;
   }
}