 /**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public :
    ListNode* reverse(ListNode*&head){
         ListNode* curr = head;
        ListNode* ptr = NULL;
        while(curr != NULL){
            ListNode* n = curr->next;
            curr->next = ptr;
            ptr = curr;
            curr = n;  
        }
        return ptr;
    }
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = reverse(head);
        ListNode* t = temp;
        if(n == 1) {
            ListNode*d = t;
            t = t->next;
            delete(d);
        }else{
            for(int i=0;i<n-2;i++){
                temp = temp->next;
            }
            ListNode* q = temp->next;
            temp->next = q->next;
            delete(q);
        }
        ListNode* r = reverse(t);
        return r;
    }
};