class Solution {
public:
    ListNode* removeZeroSumSublists(ListNode* head) {
        ListNode* prev =new ListNode(0);
        prev->next = head;
        ListNode* curr = prev;
        while(curr != nullptr){
            int sum =0;
            ListNode* fut = curr->next;
            while(fut != nullptr){
                sum += fut->val;
            if(sum == 0){
                curr->next = fut->next;
            }
            fut = fut->next;
            }
            curr = curr->next;
        }
        return prev->next;
    }
};
