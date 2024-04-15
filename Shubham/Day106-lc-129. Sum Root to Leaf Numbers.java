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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode root,int val){
        if(root==null){
            return;
        }
        val=val*10;
        val+=root.val;
        if(root.left==null && root.right==null){
            ans+=val;
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
}
