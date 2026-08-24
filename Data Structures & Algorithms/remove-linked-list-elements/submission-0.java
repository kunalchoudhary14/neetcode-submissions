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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy= new ListNode(0);
        dummy.next =head;
        ListNode prev=dummy;
        ListNode temp=head;
        
        while(temp!=null){
            if(temp.val == val){
                prev.next =  prev.next.next;
            }
            else prev=prev.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}