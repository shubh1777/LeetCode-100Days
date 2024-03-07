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
    public ListNode middleNode(ListNode head) {
    ListNode ptr=head;
    ListNode ptr2=head;
    int count=0;
    while(ptr!=null){
        count++;
        ptr=ptr.next;
    }
    int len=count; 
    len/=2;
    int c=0;
    while(c!=len){
     ptr2=ptr2.next;
     c++;
    } 
    // ListNode ptr3=ptr2;
    // while(ptr3.next!=null){
    //     ptr3=ptr3.next;
    // } 
    return ptr2;
    }
}
