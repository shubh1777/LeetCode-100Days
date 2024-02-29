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
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int lev=0;
        int prev=0;
        while(!q.isEmpty()){
            if(lev%2!=0){
                prev=Integer.MAX_VALUE;
            }
            else{
                prev=Integer.MIN_VALUE;
            }
            while(q.peek()!=null){
                if(q.peek().val%2==lev%2){
                    return false;
                }
                if(lev%2!=0 && prev<=q.peek().val){
                    return false;
                }
                if(lev%2==0 && prev>=q.peek().val){
                    return false;
                }
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                prev=q.poll().val;
            }
            q.poll();
            if(q.isEmpty()){
                break;
            }
            lev++;
            q.add(null);
        }
        return true;
        
    }
}
