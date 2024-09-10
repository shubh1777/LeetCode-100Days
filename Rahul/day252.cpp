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
public:
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode* ptr = head;
        ListNode* curr = head->next;
        if(head == NULL && head->next == NULL){
            return head;
        }
        while(curr != NULL){
            int n = gcd(ptr->val,curr->val);
            ListNode* ans = new ListNode(n);
            ptr->next = ans;
            ans->next = curr;
            ptr = curr;
            curr = curr->next;
        }
        return head;
    }
};