class Solution {
public:
    void inorder(TreeNode* root,queue<TreeNode*>& q) {
        if(!root)
           return;
        inorder(root->left,q);
        q.push(root);
        inorder(root->right,q);
    }
    TreeNode* increasingBST(TreeNode* root) {
        if(!root) return nullptr;
        queue<TreeNode*> q;
        inorder(root,q);
        TreeNode* newroot = q.front();
        TreeNode* node = newroot;
        //q.pop();
        while(!q.empty()){
            node->left = nullptr;
            node->right = q.front();
            node = node->right;
            q.pop();
        }
        node->left = nullptr;
        node->right = nullptr;
        return newroot;
    }
};