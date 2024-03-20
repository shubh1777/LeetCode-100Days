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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur=list1;
        int i=0;
        while(i<a-1){
            cur=cur.next;
            i++;
        }
        ListNode lhalf=cur;
        while(i<b+1){
            cur=cur.next;
            i++;
        }
        ListNode shalf=cur;
        ListNode rhalf=list2,rhalftail=list2;
        while(rhalftail.next!=null){
            rhalftail=rhalftail.next;
        }
        lhalf.next=rhalf;
        rhalftail.next=shalf;
        return list1;

    }
}
      
