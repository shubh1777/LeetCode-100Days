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
    public int pseudoPalindromicPaths (TreeNode root) {
       return count(root,0); 
    }
    private int count(TreeNode root,int path){
        if(root==null){
            return 0;
        }
        path ^=(1<< root.val);
        if(root.left==null && root.right==null){
            return (path &(path-1))==0 ? 1:0;
        }
        return count(root.left,path)+ count(root.right,path);
    }
}