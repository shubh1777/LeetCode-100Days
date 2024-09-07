class Solution {
public:
    bool isSubPath(ListNode* head, TreeNode* root) {
        return dfs(head,head,root);
    }
    bool dfs(ListNode* head,ListNode* curr, TreeNode* root){
        if(curr == NULL)return true;
        if(root == NULL)return false;
        if(curr->val == root->val){
            curr = curr->next;
        }else if(head->val == root->val){
            head = head->next;
        }else{
            curr = head;
        }
         return dfs(head, curr, root->left) || dfs(head, curr, root->right); 
    }
};