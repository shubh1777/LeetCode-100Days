/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int len=0;
        while(ptr != null){
           len++;
           ptr=ptr.next;
        }
        if(n==len){
            head=head.next;
            return head;
        }
        else{
            ListNode temp=head;
            int c=len-n;
            int i=1;
            while(i < c){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            return head;
        }
        
    }
}
