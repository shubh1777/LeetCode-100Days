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
    public ListNode doubleIt(ListNode head) {
        head=rev(head);
        int carry=0;
        ListNode temp=null;
        while(head!=null){
            int val=2*head.val;
            int compute=val+carry;
            carry=compute/10;
            compute=compute%10;
            ListNode ans=new ListNode(compute);
            ans.next=temp;
            temp=ans;
            head=head.next;
        }
        if(carry!=0){
            ListNode ans=new ListNode(carry);
            ans.next=temp;
            temp=ans;
        }
        return temp;
    }
    public ListNode rev(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=cur.next;
        while(next!=null){
            cur.next=prev;
            prev=cur;
            cur=next;
            next=next.next;

        }
        cur.next=prev;
        return cur;
    }
}
