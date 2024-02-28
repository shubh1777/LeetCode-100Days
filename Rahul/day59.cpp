class Solution {
public:
    int depth(TreeNode* root,int d,int arr[]){
        if(root == NULL){
           return arr[1];
        }
        if(arr[0]<d){
            arr[0]=d;
            arr[1]=root->val;
        }
        depth(root->left,d+1,arr);
        depth(root->right,d+1,arr);

        return arr[1];
    }
    int findBottomLeftValue(TreeNode* root) {
        int arr[2]={0};
        return depth(root,1,arr);
    }
};