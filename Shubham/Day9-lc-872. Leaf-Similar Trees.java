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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        addLeaf(root1,l1);
        addLeaf(root2,l2);

        return l1.equals(l2);
        
    }
    static void addLeaf(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(root.val);
        }
        addLeaf(root.left,ans);
        addLeaf(root.right,ans);
    }
}