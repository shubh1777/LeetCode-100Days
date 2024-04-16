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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        return solve(root,val,depth);
    }
    public TreeNode solve(TreeNode r,int v,int d){
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(r);
        int lev=1;
        while(q.size()>0){
            int count=q.size();
            while(count-- >0){
                TreeNode rem=q.poll();
                if(lev==d-1){
                    TreeNode left=rem.left;
                    TreeNode right=rem.right;
                    rem.left=new TreeNode(v);
                    rem.right=new TreeNode(v);
                    rem.left.left=left;
                    rem.right.right=right;
                }
                else{
                    if(rem.left!=null){
                        q.add(rem.left);
                    }
                    if(rem.right!=null){
                        q.add(rem.right);
                    }
                }
            }
            lev++;
        }
        return r;
    }
}
