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
   
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;    
        }
        int min=root.val;
        int max=root.val;
        Sol(root,min,max);
        return ans;   
    }
     public int ans=0;
    public void Sol(TreeNode root,int min,int max){
        if(root==null){
            return;
        }
        ans=Math.max(ans,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
         
        Sol(root.left,min,max);
        Sol(root.right,min,max);
    }
}