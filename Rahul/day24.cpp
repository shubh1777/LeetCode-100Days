class Solution {
public:
    bool checkTree(TreeNode* root) {
        int sum =0;
        sum = root->left->val+root->right->val;
        if(sum == root->val)
            return true;
        
        return false;
    }
};