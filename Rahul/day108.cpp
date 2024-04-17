class Solution {
public:
    string ans ="";
    void dfs(TreeNode* root,string curr){
        if(!root){
            return ;
        }
        curr = char(root->val+'a')+curr;
        if(!root->left && !root->right){
        if(ans == "" || ans > curr){
             ans = curr;
        }
        return ;
        }
        dfs(root->left,curr);
        dfs(root->right,curr);
    }
    string smallestFromLeaf(TreeNode* root) {
        dfs(root ,"");
        return ans;
    }
};