class Solution {
public:
    TreeNode* add(TreeNode* root , int val ,int depth ,int curr){
        if(root == NULL)
           return NULL;

        if(curr == depth-1){
            TreeNode* lefts = root->left;
            TreeNode* rights = root->right;

            root->left = new TreeNode(val);
            root->right = new TreeNode(val);

            root->left->left = lefts;
            root->right->right = rights;

            return root;
        }
        root->left = add(root->left,val,depth,curr+1);
        root->right = add(root->right,val,depth,curr+1);
        return root;
    }
    TreeNode* addOneRow(TreeNode* root, int val, int depth) {
        if(depth == 1){
            TreeNode* newroot =new TreeNode(val);
            newroot->left = root;
            return newroot;
        }
        int curr = 1;
        return add(root,val,depth,curr);
    }
};