class Solution {
public:
    ListNode* reverseList(ListNode* head) {
         ListNode* curr = head;
        ListNode* prev = NULL;
        while(curr != NULL){
            ListNode* f = curr->next;
            curr->next = prev;
            prev = curr;
            curr = f;
        }
      return prev;
    }
};