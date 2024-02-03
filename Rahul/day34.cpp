/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    bool isValid(TreeNode* root, long long l,long long r){
        if(root == NULL){
            return true;
        }
        if(root->val > l && root->val < r){
            return isValid(root->right,root->val,r)&& isValid(root->left,l,root->val);
        }else return false;
    }
public:
    bool isValidBST(TreeNode* root) {
        long long int mi = -10000000000,ma= 10000000000;
        return isValid(root,mi,ma);
    }
};