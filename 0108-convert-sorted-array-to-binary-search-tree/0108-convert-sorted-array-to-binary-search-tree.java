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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return convert(nums,0,n-1);
    }
    private TreeNode convert(int [] nums, int low, int high){
        if(low>high) return null;
        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums,low,mid-1);
        root.right = convert(nums,mid+1,high);
        return root;
    }
}